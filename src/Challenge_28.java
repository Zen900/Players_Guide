class Point {
    private int x;
    public int getX (){
        return x;
    }
    private int y;
    public int getY (){
        return y;
    }
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Point (){
        x = 0;
        y = 0;
    }
}

public class Challenge_28 {
    public static void main(String[] args) {
        Point pointOne = new Point(5,3);
        Point pointTwo = new Point(-4,0);
        Point origin = new Point();
        System.out.println("(" + (pointOne.getX() - origin.getX()) + "," + (pointOne.getY() - origin.getY()) + ")");
        System.out.println("(" + (pointTwo.getX() - origin.getX()) + "," + (pointTwo.getY() - origin.getY()) + ")");
    }
}
