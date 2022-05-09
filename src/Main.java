import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("The game 'Guess the Number!'" + "\n" + "Please enter a number");
        int value = new Random().nextInt(100) + 1;
//        System.out.println(value);
        int attempt = 0;
        while (attempt != value) {
            attempt = new Scanner(System.in).nextInt();
            if (attempt > value) {
                System.out.println("Your number is more than intended" + "\n" + "Try again");
            } else if (attempt < value) {
                System.out.println("Your number is less than intended" + "\n"+ "Try again");
            }
        }
        System.out.println("You guessed! Congratulations!");
    }
}