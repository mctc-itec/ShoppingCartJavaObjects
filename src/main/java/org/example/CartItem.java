package org.example;

public class CartItem {

    // Stores a product name, the price, and the quantity the user wants to order

    private String productName;      // TODO create a Product class
    private double unitPrice;    // TODO how to include this data?
    private int quantity;

    public CartItem(String newItemName, int quantityOrdered) {
        productName = newItemName;
        quantity = quantityOrdered;
    }

    // todo getters and setters

    // todo totalPrice method

    // todo display cart method


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "productName = " + productName +
                ", unitPrice = " + unitPrice +
                ", quantity = " + quantity;
    }
}
