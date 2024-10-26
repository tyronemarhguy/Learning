     // Java code​​​​​​‌‌​​​​​​​‌​​‌‌‌‌‌​‌​‌‌​​​ below
// Write your answer here, and then test your code.
// This challenge asks you to implement the Cart class's
//   getTotal() method to return the cart's total value

import java.util.ArrayList;
import java.util.List;

class Answer {
    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    static class Cart {
        List<Product> items = new ArrayList<>();

        // This method is finished.
        void addItem(ProductType productType, int quantity, double price) {
            items.add(new Product(productType, quantity, price));
        }

        // Implement getTotal() to return the total value of the cart
        double getTotal() {
            // Add your code here
            double total = 0.0;
            for (int i = 0; i < items.size(); i++){
                total += items.get(i).getPrice();
            }
            return total;
        }
    }

}

// The Product class is final and shouldn't need to be changed.
// Note that the class only has accessor methods for the fields,
//  so the field values are read-only and marked as final.
class Product {
    private final ProductType productType;
    private final int quantity;
    private final double price;

    public Product(ProductType productType, int quantity, double price) {
        this.productType = productType;
        this.quantity = quantity;
        this.price = price;
    }

    public ProductType getProductType() {
        return productType;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s, quantity: %d, price: %.2f", productType, quantity, price);
    }
}

// The ProductType enum has 3 items and shouldn't need to be changed.
enum ProductType {
    SOCKS, SHIRT, PANTS
}
