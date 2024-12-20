import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Robot {
    private int x;

    private int y;

    private boolean isPowered;

    public void moveX(int step) {
        if (isPowered) x += step;
    }

    public void moveY(int step) {
        if (isPowered) y += step;
    }

    private final RobotCommand[] commands = new RobotCommand[3];

    public Robot(List<RobotCommand> inputCommands) {
        if (inputCommands.size() != 3) throw new IllegalArgumentException("Error: Need three commands.");
        inputCommands.toArray(commands);
    }

    public void setPowered(boolean powered) {
        isPowered = powered;
    }

    public void run() {
        for (RobotCommand command : commands) {
            command.run(this);
            System.out.printf("[%d %d %b]\n", x, y, isPowered);
        }
    }
}

abstract class RobotCommand{
    public abstract void run(Robot robot);
}

class OnCommand extends RobotCommand {
    @Override
    public void run(Robot robot){
        robot.setPowered(true);
    }
}

class OffCommand extends RobotCommand {
    @Override
    public void run(Robot robot) {
        robot.setPowered(false);
    }
}

class NorthCommand extends RobotCommand {
    @Override
    public void run(Robot robot){
        robot.moveY(1);
    }
}

class SouthCommand extends RobotCommand {
    @Override
    public void run(Robot robot){
        robot.moveY(-1);
    }
}

class WestCommand extends RobotCommand {
    @Override
    public void run(Robot robot){
        robot.moveX(-1);
    }
}

class EastCommand extends RobotCommand {
    @Override
    public void run(Robot robot){
        robot.moveX(1);
    }
}

class FalseCommand extends RobotCommand{
    @Override
    public void run(Robot robot){
    }
}

public class Challenge_39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OnCommand onCommand = new OnCommand();
        OffCommand offCommand = new OffCommand();
        NorthCommand northCommand = new NorthCommand();
        EastCommand eastCommand = new EastCommand();
        SouthCommand southCommand = new SouthCommand();
        WestCommand westCommand = new WestCommand();
        FalseCommand falseCommand = new FalseCommand();
        List<RobotCommand>inputCommands = new ArrayList<>();
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
        Robot robot = new Robot(inputCommands);
        robot.run();
    }
}