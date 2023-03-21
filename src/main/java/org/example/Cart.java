package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    // Stores CartItems to represent the items the user has in their cart

    private List<CartItem> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void changeItemQuantity(String itemName, int newQuantity) {

        for (CartItem item: items) {
            if (item.getProductName().equals(itemName)) {
                item.setQuantity(newQuantity);
            }
        }

        // TODO identify if product name is not found - how to report this?

    }

    public void addItem(CartItem newItem) {
        // TODO does the user already have that item in their cart?
        //  For example, user has already ordered a hat. If they order another hat,
        //  find the existing het item in the items and increase the quantity of that item by 1
        //  instead of adding a new hat. You could use the changeItemQuantity method!
        items.add(newItem);
    }

    public void displayCart() {
        for (CartItem item: items) {
            System.out.println(item);
        }
    }
}
