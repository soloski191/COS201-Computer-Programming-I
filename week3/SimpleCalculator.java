import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Simple Calculator");

        Scanner input = new Scanner(System.in);

        // Ask the user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        // Perform calculations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        // Display results
        System.out.println("\n--- Calculator Results ---");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        // Check before division
        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Quotient: Cannot divide by zero");
        }

        input.close();
    }
}