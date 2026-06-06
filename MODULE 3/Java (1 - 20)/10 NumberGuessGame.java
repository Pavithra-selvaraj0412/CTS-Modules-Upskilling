import java.util.Random;
import java.util.Scanner;

public class GuessGame
 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;
        int guess = 0;

        while (guess != number) {
            guess = sc.nextInt();

            if (guess > number) {
                System.out.println("Too High");
            } else if (guess < number) {
                System.out.println("Too Low");
            } else {
                System.out.println("Correct");
            }
        }

        sc.close();
    }
}