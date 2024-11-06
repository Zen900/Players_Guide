import java.util.Scanner;

class Arrows {
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
    public void setMyFletching(Fletching newMyFletiching){
        this.myFletching = newMyFletiching;
    }
}


public class Challenge_26 {
    public static void main(String[] args) {
        Arrows myObj = new Arrows();
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        float cost = 0;
        while (count == 0){
            System.out.println("Choose one of the following options: steel, wood or obsidian");
            String user = scanner.next();
            if (user.equals("steel")){
                myObj.setMyArrowhead(Arrows.Arrowhead.STEEL);
                cost = 10;
                count++;
            }
            if (user.equals("wood")){
                myObj.setMyArrowhead(Arrows.Arrowhead.WOOD);
                cost = 3;
                count++;
            }
            if (user.equals("obsidian")){
                myObj.setMyArrowhead(Arrows.Arrowhead.OBSIDIAN);
                cost = 5;
                count++;
            }
        }
        while (count == 1){
            System.out.println("Choose one of the following options: plastic, turkey or goose");
            String user = scanner.next();
            if (user.equals("plastic")){
                myObj.setMyFletching(Arrows.Fletching.PLASTIC);
                cost += 10;
                count++;
            }
            if (user.equals("turkey")){
                myObj.setMyFletching(Arrows.Fletching.TURKEY_FEATHERS);
                cost += 5;
                count++;
            }
            if (user.equals("goose")){
                myObj.setMyFletching(Arrows.Fletching.GOOSE_FEATHERS);
                cost += 3;
                count++;
            }
        }
        while (myObj.getLength() <= 59 || myObj.getLength() >= 101 ){
            System.out.println("What should the length of the shaft be? Choose a length between 60cm and 100cm");
            myObj.setLength(scanner.nextInt());
        }

        String arrow = myObj.getLength() + "cm " +  myObj.getMyArrowhead() + " " + myObj.getMyFletching() + " arrow";
        System.out.println(arrow);
        System.out.println("the arrow's cost is " + getCost(myObj.getLength(), cost) + " gold");

    }
    private static float getCost (int length, float cost){
        return (float) (length * 0.05 + cost);
    }
}
