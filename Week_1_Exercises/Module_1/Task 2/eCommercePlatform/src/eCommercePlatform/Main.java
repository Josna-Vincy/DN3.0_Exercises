package eCommercePlatform;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Smartphone", "Electronics"),
                new Product(3, "Book", "Education"),
                new Product(4, "Pencil Sharpner", "Stationery"),
                new Product(5, "Chair", "Furniture")
        };
        Arrays.sort(products, (p1, p2) -> Integer.compare(p1.getProductId(), p2.getProductId()));

        Product result = LinearSearch.linearSearch(products, 2);
        System.out.println("Linear Search Result: " + result);

        result = BinarySearchAlgorithm.binarySearch(products, 4);
        System.out.println("Binary Search Result: " + result);
    }
}

