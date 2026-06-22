import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Smartphone", "Electronics"),
                new Product(3, "T-shirt", "Clothing"),
                new Product(4, "Jeans", "Clothing"),
                new Product(5, "Headphones", "Electronics")
        };

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the E-commerce Search Test!");

        System.out.println("\nAvailable Products:");

        for (Product p : products) {
            System.out.println(
                    "ID: " + p.getProductId() +
                            ", Name: " + p.getProductName() +
                            ", Category: " + p.getCategory());
        }

        System.out.print("\nEnter Product ID: ");

        int id = sc.nextInt();

        Product linear = SearchFunction.linearSearch(products, id);

        if (linear != null) {
            System.out.println("\nLinear Search Result O(N):");
            System.out.println("Product Name: " + linear.getProductName());
        } else {
            System.out.println("Product Not Found");
        }

        Product binary = SearchFunction.binarySearch(products, id);

        if (binary != null) {
            System.out.println("\nBinary Search Result O(logN):");
            System.out.println("Product Name: " + binary.getProductName());
        } else {
            System.out.println("Product Not Found");
        }

        sc.close();
    }
}