import java.util.Random;
import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int target = random.nextInt(100) + 1;
        int guesses = 0;
        System.out.println("Guess the number between 1 and 100.");

        while (true) {
            System.out.print("Enter your guess: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid integer.");
                scanner.next();
                continue;
            }
            int guess = scanner.nextInt();
            guesses++;

            if (guess < target) {
                System.out.println("Too low.");
            } else if (guess > target) {
                System.out.println("Too high.");
            } else {
                System.out.println("Correct! You guessed the number in " + guesses + " tries.");
                break;
            }
        }

        scanner.close();
    }
}
