import java.util.Arrays;
import java.util.Comparator;

public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mobile", "Electronics"),
                new Product(103, "Keyboard", "Accessories"),
                new Product(104, "Mouse", "Accessories"),
                new Product(105, "Monitor", "Electronics")
        };

        // Linear Search
        Product result1 = SearchAlgorithms.linearSearch(products, "Mouse");

        System.out.println("Linear Search");

        if (result1 != null) {
            System.out.println("ID : " + result1.productId);
            System.out.println("Name : " + result1.productName);
            System.out.println("Category : " + result1.category);
        }

        // Sort array for Binary Search
        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        Product result2 = SearchAlgorithms.binarySearch(products, "Mouse");

        System.out.println("\nBinary Search");

        if (result2 != null) {
            System.out.println("ID : " + result2.productId);
            System.out.println("Name : " + result2.productName);
            System.out.println("Category : " + result2.category);
        }

    }
}