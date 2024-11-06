public class Challenge_34 {
    public static void main(String[] args) {
        int moves = 0;
        board();
    }

    public static void board (){
        int count = 0;
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int[] randomNumbers = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        for (int a = 0;a<=15;a++){
            while (randomNumbers[a] == 0){
                randomNumbers[a] = numbers[(int)(Math.random()*16)];
            }
            for (int b = 0; b<=15;b++){
                if (randomNumbers[a] == numbers[b]){
                    numbers[b] = 0;
                }
            }
        }

        for (int i = 1;i<=4;i++){
            System.out.println("————————————————");
            for (int j = 1;j<=4;j++){
                System.out.print("| " + randomNumbers[count] + " ");
                count++;
            }
            System.out.println("|");
        }
        System.out.println("————————————————");
    }
}
