package InventoryManagement;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product product1 = new Product("P001", "Laptop", 10, 80000.00);
        Product product2 = new Product("P002", "Smartphone", 20, 50000.00);

        inventory.addProduct(product1);
        inventory.addProduct(product2);


        Product updatedProduct1 = new Product("P001", "Laptop", 15, 80000.00);
        inventory.updateProduct("P001", updatedProduct1);

        inventory.deleteProduct("P002");

        Product retrievedProduct = inventory.getProduct("P001");
        System.out.println("Retrieved Product: " + retrievedProduct);
    }
}
