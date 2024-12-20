package Challenge_43;

class ColoredItem <Color>{
    private final Color color;
    private final Class items;
    public static final String BLUE = "\u001B[34m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public ColoredItem(Color color, Class items){
        this.color = color;
        this.items = items;
    }
    void display(){
        System.out.println(color + items.getSimpleName());
    }
}

public class Challenge_43 {
    public static void main(String[] args){
        ColoredItem<String> sword = new ColoredItem<>(ColoredItem.BLUE, Sword.class);
        ColoredItem<String> bow = new ColoredItem<>(ColoredItem.RED, Bow.class);
        ColoredItem<String> axe = new ColoredItem<>(ColoredItem.GREEN, Axe.class);
        sword.display();
        bow.display();
        axe.display();
    }
}