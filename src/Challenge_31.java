import java.util.Scanner;

class Door {
    enum State{
        LOCKED,
        OPEN,
        CLOSED
    }
    State myState;
    int passcode;
    Door (State myState, int passcode){
        this.myState = myState;
        this.passcode = passcode;
    }
    public static State closed (State state){
        if (state == State.OPEN) return State.CLOSED;
        else return state;
    }
    public static State opened (State state){
        if (state == State.CLOSED) return State.OPEN;
        else return state;
    }
    public static State locked (State state){
        if (state == State.CLOSED) return State.LOCKED;
        else return state;
    }
    public static State unlocked (State state, int passcode, Scanner scanner){
        System.out.println("What is the passcode? ");
        int userPasscode = scanner.nextInt();
        if (state == State.LOCKED && passcode == userPasscode) return State.OPEN;
        else return state;
    }
}

public class Challenge_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the starting numeric passcode?");
        int passcode = scanner.nextInt();
        Door door = new Door(Door.State.LOCKED,passcode);
        String answer = " ";
        while (!answer.equals("exit")){
            System.out.println("What do you want to do with the door? open, close, lock, unlock, change passcode? ");
            answer = scanner.next();
            if (answer.equals("open")) {
                door.myState = Door.opened(door.myState);
            }
            if (answer.equals("close")) {
                door.myState = Door.closed(door.myState);
            }
            if (answer.equals("lock")) {
                door.myState = Door.locked(door.myState);
            }
            if (answer.equals("unlock")) {
                door.myState = Door.unlocked(door.myState,passcode,scanner);
            }
            if (answer.equals("change")) {
                System.out.println("What is the passcode? ");
                int userPasscode = scanner.nextInt();
                passcode = changePasscode(passcode,userPasscode, scanner);
            }
            System.out.println("The door is " + door.myState);
        }
    }
    public static int changePasscode (int passcode, int userPasscode, Scanner scanner){
        if (passcode == userPasscode) {
            System.out.println("What should be the new passcode?");
            passcode = scanner.nextInt();
        }
        return passcode;
    }
}
