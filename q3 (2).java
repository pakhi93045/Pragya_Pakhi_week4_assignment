import java.util.Scanner;

public class Main {

    public int divide(int a, int b) throws ArithmeticException {
        return a / b;  
    }

    public void checkString(String input) throws NullPointerException {
        if (input == null || input.isEmpty()) {
            throw new NullPointerException("Input string is null or empty.");
        } else {
            System.out.println("Input string is valid: " + input);
        }
    }

    public void checkPositiveNumber(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be positive.");
        } else {
            System.out.println("The number is valid: " + number);
        }
    }

    public static void main(String[] args) {
        Main program = new Main();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter a denominator: ");
            int denominator = scanner.nextInt();
            int result = program.divide(numerator, denominator);
            System.out.println("Division result: " + result);

            scanner.nextLine();  
            System.out.print("Enter a string (or press Enter to trigger exception): ");
            String inputString = scanner.nextLine();
            program.checkString(inputString);

            System.out.print("Enter a positive number: ");
            int number = scanner.nextInt();
            program.checkPositiveNumber(number);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero. " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();  
            System.out.println("Program execution completed.");
        }
    }
}
