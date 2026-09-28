import java.util.Scanner;

public class NumberGuessingGame {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Math.random();  // 0.0-1.0
        int secretnumber = (int) (Math.random() * 100) + 1; //if 0 the +1bcz our range 1 to 100s
        System.out.println("==Number guessing game====");
        System.out.println("I have selected a number betwen 1 and 100");
        System.out.println("Try to guess it!");

        int attempts = 0;
        while (true) {
            System.out.print("enter your guess:");
            int guess = sc.nextInt();
            attempts++;
            if (guess == secretnumber) {
                System.out.println("Correct!");
                System.out.println("You guessed the number in " + attempts + "attempst");
                break;
            } else if (guess > secretnumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }
        }
        sc.close();
    }
}




