package org.example;

import java.util.Map;

import static input.InputUtils.intInput;

/** Displays a menu of choices, gets user's choice */

public class Menu {

    // What modifiers do these constants have?
    public static final int ADD_ITEM = 1;
    public static final int CHANGE_QUANTITY = 2;
    public static final int CHECK_OUT = 3;

    //  add item
    // Change quantity of item
    // Check out

    private Map<Integer, String> menuOptions = Map.of(
            ADD_ITEM, "Add item",
            CHANGE_QUANTITY, "Change quantity of item",
            CHECK_OUT, "Check out");

    public int displayMenuGetChoice() {

        while (true) {
            displayMenu();

            int userChoice = intInput("Enter your selection");

            if (validateMenuChoiceInput(userChoice)) {
                return userChoice;
            }

            else {
                System.out.println("Enter a valid choice");
            }
        }
    }

    private void displayMenu() {
        for (int option: menuOptions.keySet()) {
            String menuItemText = menuOptions.get(option);
            System.out.println(option + ": " + menuItemText);
        }
    }

    private boolean validateMenuChoiceInput(int input) {
        if (menuOptions.containsKey(input)) {
            return true;
        } else {
            return false;
        }
    }

    // TODO add a delete option

}
