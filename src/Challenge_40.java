import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Robot40 {
    private int x;

    private int y;

    private boolean isPowered;

    public void moveX(int step) {
        if (isPowered) x += step;
    }

    public void moveY(int step) {
        if (isPowered) y += step;
    }

    private final RobotCommand40[] commands = new RobotCommand40[3];

    public Robot40(List<RobotCommand40> inputCommands) {
        if (inputCommands.size() != 3) throw new IllegalArgumentException("Error: Need three commands.");
        inputCommands.toArray(commands);
    }

    public void setPowered(boolean powered) {
        isPowered = powered;
    }

     void run() {
        for (RobotCommand40 command : commands) {
            command.run(this);
            System.out.printf("[%d %d %b]\n", x, y, isPowered);
        }
    }
}

interface RobotCommand40{
    void run(Robot40 robot);
}

class OnCommand40 implements RobotCommand40 {
     public void run(Robot40 robot){
        robot.setPowered(true);
    }
}

class OffCommand40 implements RobotCommand40 {
    public void run(Robot40 robot) {
        robot.setPowered(false);
    }
}

class NorthCommand40 implements RobotCommand40 {
    public void run(Robot40 robot){
        robot.moveY(1);
    }
}

class SouthCommand40 implements RobotCommand40 {
    public void run(Robot40 robot){
        robot.moveY(-1);
    }
}

class WestCommand40 implements RobotCommand40 {
    public void run(Robot40 robot){
        robot.moveX(-1);
    }
}

class EastCommand40 implements RobotCommand40 {
    public void run(Robot40 robot){
        robot.moveX(1);
    }
}

class FalseCommand40 implements RobotCommand40{
    public void run(Robot40 robot){
    }
}

public class Challenge_40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OnCommand40 onCommand = new OnCommand40();
        OffCommand40 offCommand = new OffCommand40();
        NorthCommand40 northCommand = new NorthCommand40();
        EastCommand40 eastCommand = new EastCommand40();
        SouthCommand40 southCommand = new SouthCommand40();
        WestCommand40 westCommand = new WestCommand40();
        FalseCommand40 falseCommand = new FalseCommand40();
        List<RobotCommand40>inputCommands = new ArrayList<>();
        System.out.println("What are your three commands?");
        for (int i = 0 ; i<3 ; i++){
            String user = scanner.next();
            inputCommands.add(switch (user) {
                case "on" -> onCommand;
                case "off" -> offCommand;
                case "north" -> northCommand;
                case "south" -> southCommand;
                case "east" -> eastCommand;
                case "west" -> westCommand;
                default -> falseCommand;
            });
        }
        Robot40 robot = new Robot40(inputCommands);
        robot.run();
    }
}