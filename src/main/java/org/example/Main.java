package org.example;

import static input.InputUtils.intInput;

public class Main {
    public static void main(String[] args) {

        // Example shopping cart application
        // TODO the program can't manage prices of items
        //  obviously an issue when calculating what to charge customers!
        //  Let's review the code we have, and work on a fix.

        System.out.println("Winter Accessories Store Shopping Program");

        Inventory inventory = new Inventory();
        Menu menu = new Menu();
        Cart cart = new Cart();

        inventory.showInventory();

        while (true) {
            int choice = menu.displayMenuGetChoice();

            if (choice == Menu.ADD_ITEM) {
                // Add item to cart
                String newItemName = inventory.selectItem();
                int quantity = intInput("How many do you want to order?");
                CartItem item = new CartItem(newItemName, quantity);
                cart.addItem(item);
            } else if (choice == Menu.CHANGE_QUANTITY) {
                // TODO - how to implement?
            } else if (choice == Menu.CHECK_OUT){
                // user has created their cart, so quit loop to move onto the checkout process
                break;
            }
            else {
                System.out.println("Not a valid choice, try again");
            }
        }

        cart.displayCart();

        // TODO another part of the program would manage getting the user's shipping address,
        //  taking payment - we won't cover that here.

    }
}