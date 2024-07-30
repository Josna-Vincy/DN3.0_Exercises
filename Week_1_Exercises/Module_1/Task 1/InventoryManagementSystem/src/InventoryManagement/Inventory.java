package InventoryManagement;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Inventory {
    private final HashMap<String, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }

    // Add a product to the inventory
    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
        System.out.println("Product added: " + product);
    }

    // Update an existing product in the inventory
    public void updateProduct(String productId, Product newProduct) {
        if (products.containsKey(productId)) {
            products.put(productId, newProduct);
            System.out.println("Product updated: " + newProduct);
        } else {
            System.out.println("Product not found: " + productId);
        }
    }

    // Delete a product from the inventory
    public void deleteProduct(String productId) {
        Product removedProduct = products.remove(productId);
        if (removedProduct != null) {
            System.out.println("Product deleted: " + removedProduct);
        } else {
            System.out.println("Product not found: " + productId);
        }
    }

    // Get product details by productId
    public Product getProduct(String productId) {
        return products.get(productId);
    }

    // Get details of all products
    public List<Product> getAllProducts() {
        return new ArrayList<>(products.values());
    }
}

