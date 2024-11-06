import java.util.Scanner;

class Arrow {
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
    int length = 0;
    Arrowhead myArrowhead;
    Fletching myFletching;
}


public class Challenge_25 {
    public static void main(String[] args) {
        Arrow myObj = new Arrow();
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        float cost = 0;
        while (count == 0){
            System.out.println("Choose one of the following options: steel, wood or obsidian");
            String user = scanner.next();
            if (user.equals("steel")){
                myObj.myArrowhead = Arrow.Arrowhead.STEEL;
                cost = 10;
                count++;
            }
            if (user.equals("wood")){
                myObj.myArrowhead = Arrow.Arrowhead.WOOD;
                cost = 3;
                count++;
            }
            if (user.equals("obsidian")){
                myObj.myArrowhead = Arrow.Arrowhead.OBSIDIAN;
                cost = 5;
                count++;
            }
        }
        while (count == 1){
            System.out.println("Choose one of the following options: plastic, turkey feathers or goose feathers");
            String user = scanner.next();
            if (user.equals("plastic")){
                myObj.myFletching = Arrow.Fletching.PLASTIC;
                cost += 10;
                count++;
            }
            if (user.equals("turkey feathers")){
                myObj.myFletching = Arrow.Fletching.TURKEY_FEATHERS;
                cost += 5;
                count++;
            }
            if (user.equals("goose feathers")){
                myObj.myFletching = Arrow.Fletching.GOOSE_FEATHERS;
                cost += 3;
                count++;
            }
        }
        while (myObj.length <= 59 || myObj.length >= 101 ){
            System.out.println("What should the length of the shaft be? Choose a length between 60cm and 100cm");
            myObj.length = scanner.nextInt();
        }

        String arrow = myObj.length + "cm " +  myObj.myArrowhead + " " + myObj.myFletching + " arrow";
        System.out.println(arrow);
        System.out.println("the arrow's cost is " + getCost(myObj.length, cost) + " gold");

    }
    static float getCost (int length, float cost){
        return (float) (length * 0.05 + cost);
    }
}
