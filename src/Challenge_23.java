import java.util.Scanner;

public class Challenge_23 {
    enum State {
        OPEN,
        CLOSED,
        LOCKED
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        State state = State.LOCKED;
        while (true){
            System.out.print("The chest is "+state.toString().toLowerCase()+". What do you want to do? ");
            String newState = scanner.next();
            if (state == State.OPEN && newState.equals("close")) state = State.CLOSED;
            if (state == State.CLOSED && newState.equals("open")) state = State.OPEN;
            if (state == State.CLOSED && newState.equals("lock")) state = State.LOCKED;
            if (state == State.LOCKED && newState.equals("unlock")) state = State.CLOSED;
        }
    }
}