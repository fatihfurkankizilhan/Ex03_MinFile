import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int result = 0;

        do {
            System.out.print("Enter a number (Enter 0 or a negative number to exit): ");
            number = scanner.nextInt();

            if (number > 0) {
                result = number - 5;
                System.out.println("Result: " + result);
            } else {
                break;
            }

            if (result <= 0) {
                result += 5;
                System.out.println("Result: " + result);
            }

        } while (true);

        System.out.println("Program terminated.");
    }
}