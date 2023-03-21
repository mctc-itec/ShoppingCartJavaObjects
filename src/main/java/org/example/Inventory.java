package org.example;

import java.util.List;

import static input.InputUtils.stringInput;

public class Inventory {

    // Make list of product names

    private List<String> products = List.of("Hat", "Scarf", "Boots", "Gloves", "Mittens");
    // todo how to show prices? Replace with Product objects

    public void showInventory() {
        for (String product: products) {
            System.out.println(product);
        }
    }

    public String selectItem() {
        showInventory();
        while (true) {
            String selection = stringInput("Enter the product name ");
            if (products.contains(selection)) {
                return selection;
            } else {
                System.out.println("Not a valid product name");
            }
        }
    }
}
