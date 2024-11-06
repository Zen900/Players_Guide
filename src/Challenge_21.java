public class Challenge_21 {
    public static void main(String[] args) {
        recursion(10);
    }
    public static void recursion (int x){
        if (x>0){
            System.out.println(x);
            recursion(x-1);
        }
    }
}
