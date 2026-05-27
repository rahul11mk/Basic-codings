import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose program:");
        System.out.println("1 - Guess Number");
        System.out.println("2 - Traffic Light");
        System.out.print("Enter 1 or 2: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            playGuessNumber(scanner);
        } else if (choice == 2) {
            trafficLightSwitch(scanner);
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    private static void playGuessNumber(Scanner scanner) {
        Random random = new Random();
        int target = random.nextInt(100) + 1;
        int guess = 0;

        System.out.println("Guess a number between 1 and 100.");

        while (guess != target) {
            System.out.print("Your guess: ");
            if (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Please enter a valid number.");
                continue;
            }
            guess = scanner.nextInt();

            if (guess < target) {
                System.out.println("Too low.");
            } else if (guess > target) {
                System.out.println("Too high.");
            } else {
                System.out.println("Correct! You guessed the number.");
            }
        }
    }

    private static void trafficLightSwitch(Scanner scanner) {
        System.out.print("Enter traffic light color (red, yellow, green): ");
        String color = scanner.nextLine().trim().toLowerCase();

        switch (color) {
            case "red":
                System.out.println("Stop.");
                break;
            case "yellow":
                System.out.println("Prepare to stop.");
                break;
            case "green":
                System.out.println("Go.");
                break;
            default:
                System.out.println("Unknown color. Use red, yellow, or green.");
        }
    }
}