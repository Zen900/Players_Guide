import java.util.ArrayList;
import java.util.Scanner;

class InventoryItem38{
    double weight;
    double volume;
    InventoryItem38(double weight, double volume){
        this.weight = weight;
        this.volume = volume;
    }
}
class Arrow38 extends InventoryItem38{
    Arrow38() {
        super(0.1,0.05);
    }
    @Override
    public String toString(){
        return "Arrow ";
    }
}

class Bow38 extends InventoryItem38{
    Bow38(){
        super(1,4);
    }
    @Override
    public String toString(){
        return "Bow ";
    }
}

class Rope38 extends InventoryItem38{
    Rope38(){
        super(1,1.5);
    }
    @Override
    public String toString(){
        return "Rope ";
    }
}

class Water38 extends InventoryItem38{
    Water38(){
        super(2,3);
    }
    @Override
    public String toString(){
        return "Water ";
    }
}

class Food38 extends InventoryItem38{
    Food38(){
        super(1,0.5);
    }
    @Override
    public String toString(){
        return "Food ";
    }
}

class Sword38 extends InventoryItem38{
    Sword38(){
        super(5,3);
    }
    @Override
    public String toString(){
        return "Sword ";
    }
}

class Pack38{
    final int maxItems = 20;
    final double maxWeight = 10;
    final double maxVolume = 12;
    ArrayList<InventoryItem38> items = new ArrayList<>();
    double totalWeight = 0;
    double totalVolume = 0;
    public boolean add(InventoryItem38 item){
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

    @Override
    public String toString(){
        StringBuilder contents = new StringBuilder("Pack containing ");
        for (InventoryItem38 item : items) {
            contents.append(item.toString());
        }
        return contents + "";
    }
}

public class Challenge_38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InventoryItem38 inventoryItem = new InventoryItem38(0,0);
        Arrow38 arrow = new Arrow38();
        Bow38 bow = new Bow38();
        Rope38 rope = new Rope38();
        Water38 water = new Water38();
        Food38 food = new Food38();
        Sword38 sword = new Sword38();
        Pack38 pack = new Pack38();
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
                System.out.println("This is an incorrect number, please try again");
                user = scanner.nextInt();
            }
            inventoryItem = switch (user) {
                case 1 -> arrow;
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
            System.out.println(pack);
        }
    }
}
