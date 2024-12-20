public class Challenge_41 {
    public static void main(String[] args) {
        Coordinate coordinateOne = new Coordinate(9,7);
        Coordinate coordinateTwo = new Coordinate(7,6);
        System.out.println(coordinateOne.adjacent(coordinateTwo));
    }
    public record Coordinate (int x, int y){
        public boolean adjacent(Coordinate other) {
            int xDiff = this.x - other.x;
            int yDiff = this.y - other.y;
            int manhattan = Math.abs(xDiff + yDiff);
            return manhattan == 1;
        }
    }
}
