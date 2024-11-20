import java.util.ArrayList;
import java.util.Scanner;

class InventoryItem{
    double weight;
    double volume;
    InventoryItem(double weight, double volume){
        this.weight = weight;
        this.volume = volume;
    }
}
class Arrow37 extends InventoryItem{
    Arrow37() {
        super(0.1,0.05);
    }
}

class Bow extends InventoryItem{
    Bow(){
        super(1,4);
    }
}

class Rope extends InventoryItem{
    Rope(){
        super(1,1.5);
    }
}

class Water extends InventoryItem{
    Water(){
        super(2,3);
    }
}

class Food extends InventoryItem{
    Food(){
        super(1,0.5);
    }
}

class Sword extends InventoryItem{
    Sword(){
        super(5,3);
    }
}

class Pack{
    final int maxItems = 20;
    final double maxWeight = 10;
    final double maxVolume = 12;
    ArrayList<InventoryItem> items = new ArrayList<>();
    double totalWeight = 0;
    double totalVolume = 0;
    public boolean add(InventoryItem item){
        items.add(item);
        totalWeight += items.get(items.size()-1).weight;
        totalVolume += items.get(items.size()-1).volume;
        return totalWeight < maxWeight && totalVolume < maxVolume && items.size() < maxItems;
    }
    public void state(){
        System.out.println("The current item count is: " + items.size());
        System.out.println("The weight is: " + totalWeight);
        System.out.println("The volume is: " + totalVolume);
        System.out.println("The limits are: maximum items = " + maxItems + " maximum weight = " +
                maxWeight + " maximum volume = " + maxVolume);
    }
}

public class Challenge_37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InventoryItem inventoryItem = new InventoryItem(0,0);
        Arrow37 arrow37 = new Arrow37();
        Bow bow = new Bow();
        Rope rope = new Rope();
        Water water = new Water();
        Food food = new Food();
        Sword sword = new Sword();
        Pack pack = new Pack();
        int user;
        boolean exceed;

        while (pack.items.size() < pack.maxItems) {
            System.out.println("Choose an item (pick a number)");
            System.out.println("""
                    1. An arrow has a weight of 0.1 and a volume of 0.05.
                    2. A bow has a weight of 1 and a volume of 4.
                    3. Rope has a weight of 1 and a volume of 1.5.
                    4. Water has a weight of 2 and a volume of 3.
                    5. Food rations have a weight of 1 and a volume of 0.5.
                    6. A sword has a weight of 5 and a volume of 3.
                    """);
            user = scanner.nextInt();
            while (user <= 0 || user > 6) {
                user = scanner.nextInt();
                System.out.println("This is an incorrect number, please try again");
            }
            if (user == 1) {
                inventoryItem = sword;
            }
            inventoryItem = switch (user) {
                case 1 -> arrow37;
                case 2 -> bow;
                case 3 -> rope;
                case 4 -> water;
                case 5 -> food;
                case 6 -> sword;
                default -> inventoryItem;
            };
            exceed = pack.add(inventoryItem);
            if (!exceed) {
                System.out.println("This is not possible, a limit has been reached");
                pack.totalWeight -= pack.items.get(pack.items.size()-1).weight;
                pack.totalVolume -= pack.items.get(pack.items.size()-1).volume;
                pack.items.remove(pack.items.size() - 1);
            }
            pack.state();
        }
    }
}
