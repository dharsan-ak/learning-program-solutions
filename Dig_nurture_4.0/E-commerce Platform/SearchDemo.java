// SearchDemo.java
import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {

    // Linear Search by Name
    public static Product linearSearch(Product[] products, String name) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    // Binary Search by Name (Assumes sorted array)
    public static Product binarySearch(Product[] products, String name) {
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);

            if (cmp == 0)
                return products[mid];
            else if (cmp < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Shoes", "Footwear"),
            new Product(102, "Shirt", "Apparel"),
            new Product(103, "Laptop", "Electronics"),
            new Product(104, "Mobile", "Electronics"),
            new Product(105, "Watch", "Accessories")
        };

        // Linear Search Test
        System.out.println("Linear Search: Searching for 'Laptop'");
        Product result1 = linearSearch(products, "Laptop");
        System.out.println(result1 != null ? result1 : "Product not found");

        // Sort by productName for Binary Search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        // Binary Search Test
        System.out.println("\nBinary Search: Searching for 'Laptop'");
        Product result2 = binarySearch(products, "Laptop");
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}

