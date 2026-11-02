import java.util.Scanner;

public class ItemCost {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();

        // Calculate total cost
        double totalCost = quantity * unitPrice;

        // Display results
        System.out.println("\n--- Item Details ---");
        System.out.println("Item Name: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total Cost: " + totalCost);

        input.close();
     }
}