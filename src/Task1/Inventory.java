package Task1;
import java.util.ArrayList;
import java.util.Scanner;
public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> inventory = new ArrayList<>();

        System.out.println("Choose product type:");
        System.out.println("Enter 1 >> for Electronics");
        System.out.println("Enter 2 >> for Clothing");
        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Price: ");
        double price = scanner.nextDouble();

        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                inventory.add(new Electronics(name,quantity,price));
                System.out.println("Electronics product added!");
                break;
            case 2:
                inventory.add(new Clothing(name,quantity,price));
                System.out.println("Clothing product added!");
                break;
            default:
                System.out.println("Invalid choice. Product not added.");
        }

        for (Product product : inventory) {
            System.out.println(product);
        }
        scanner.close();








    }
}