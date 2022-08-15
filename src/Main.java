import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numPlayer = 0;
        while (true){
            System.out.printf("Input number of player [2-8] : ");
            numPlayer = input.nextInt();

            if(numPlayer >= 2 && numPlayer <= 8){
                break;
            }
        }
        MGame mGame = new MGame(numPlayer,20,50,2);
        mGame.playGame();
    }
}
