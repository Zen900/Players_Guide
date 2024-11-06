import java.util.Scanner;

class ArrowCreator {
    public ArrowCreator() {}
    enum Arrowhead{
        STEEL,
        WOOD,
        OBSIDIAN
    }
    enum Fletching{
        PLASTIC,
        TURKEY_FEATHERS,
        GOOSE_FEATHERS
    }
    private int length;
    public int getLength(){
        return length;
    }
    public void setLength(int newLength){
        this.length = newLength;
    }
    private Arrowhead myArrowhead;
    public Arrowhead getMyArrowhead(){
        return myArrowhead;
    }
    public void setMyArrowhead(Arrowhead newMyArrowhead){
        this.myArrowhead = newMyArrowhead;
    }
    private Fletching myFletching;
    public Fletching getMyFletching(){
        return myFletching;
    }
    public void setMyFletching(Fletching newMyFletching){
        this.myFletching = newMyFletching;
    }

    public ArrowCreator (Arrowhead arrowhead, Fletching fletching, int length) {
        this.myArrowhead = arrowhead;
        this.myFletching = fletching;
        this.length = length;
    }

    public static ArrowCreator createEliteArrow (){
        return new ArrowCreator(Arrowhead.STEEL, Fletching.PLASTIC, 95);
    }
    public static ArrowCreator createBeginnerArrow (){
        ArrowCreator.Fletching fletching = Fletching.GOOSE_FEATHERS;
        ArrowCreator.Arrowhead arrowhead = Arrowhead.WOOD;
        int length = 75;
        return new ArrowCreator(arrowhead, fletching, length);
    }
    public static ArrowCreator createMarksmanArrow (){
        ArrowCreator.Fletching fletching = Fletching.GOOSE_FEATHERS;
        ArrowCreator.Arrowhead arrowhead = Arrowhead.STEEL;
        int length = 65;
        return new ArrowCreator(arrowhead, fletching, length);
    }
}


public class Challenge_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrowCreator arrow = null;

        System.out.println("Pick a number: 1. The Elite Arrow 2. The Beginner Arrow 3. The Marksman Arrow 4. Custom Arrow");
        int number = scanner.nextInt();

        switch (number) {
            case 1 -> arrow = ArrowCreator.createEliteArrow();
            case 2 -> arrow = ArrowCreator.createBeginnerArrow();
            case 3 -> arrow = ArrowCreator.createMarksmanArrow();
            case 4 -> arrow = customArrow();
            default -> System.out.println("Invalid choice. Exiting.");
        }

        if (arrow != null) {
            System.out.println(arrow.getLength() + " cm " + arrow.getMyArrowhead() + " " + arrow.getMyFletching() + " arrow");
        }

    }
    private static ArrowCreator customArrow (){
        Scanner scanner = new Scanner(System.in);
        ArrowCreator myObj = new ArrowCreator();
        int count = 0;
        while (count == 0){
            System.out.println("Choose one of the following options: steel, wood or obsidian");
            String user = scanner.next();
            if (user.equals("steel")){
                myObj.setMyArrowhead(ArrowCreator.Arrowhead.STEEL);
                count++;
            }
            if (user.equals("wood")){
                myObj.setMyArrowhead(ArrowCreator.Arrowhead.WOOD);
                count++;
            }
            if (user.equals("obsidian")){
                myObj.setMyArrowhead(ArrowCreator.Arrowhead.OBSIDIAN);
                count++;
            }
        }
        while (count == 1){
            System.out.println("Choose one of the following options: plastic, turkey or goose");
            String user = scanner.next();
            if (user.equals("plastic")){
                myObj.setMyFletching(ArrowCreator.Fletching.PLASTIC);
                count++;
            }
            if (user.equals("turkey")){
                myObj.setMyFletching(ArrowCreator.Fletching.TURKEY_FEATHERS);
                count++;
            }
            if (user.equals("goose")){
                myObj.setMyFletching(ArrowCreator.Fletching.GOOSE_FEATHERS);
                count++;
            }
        }
        while (myObj.getLength() <= 59 || myObj.getLength() >= 101 ){
            System.out.println("What should the length of the shaft be? Choose a length between 60cm and 100cm");
            myObj.setLength(scanner.nextInt());
        }
        return new ArrowCreator(myObj.getMyArrowhead(), myObj.getMyFletching(), myObj.getLength());
    }
}
