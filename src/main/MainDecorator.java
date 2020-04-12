package main;

import decorator.Pizza;
import decorator.condiments.Cheese;
import decorator.condiments.Olive;
import decorator.condiments.Pepper;
import decorator.pizzas.ThickCrustPizza;
import decorator.pizzas.ThinCrustPizza;

import java.io.IOException;
import java.util.Scanner;

public class MainDecorator {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean orderDone = false;
    private static Pizza pizza;

    public static void main(String[] args) {
        selectPizzaType();

        while (!orderDone) {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            showPizza();
            showMenu();
            getUserInput();
        }
        System.out.println("Thank you for ordering!");
        System.out.println(pizza.getDescription());
        System.out.println("Total cost: $" + pizza.cost());
    }

    private static void getUserInput() {
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                pizza = new Cheese(pizza);
                break;
            case 2:
                pizza = new Olive(pizza);
                break;
            case 3:
                pizza = new Pepper(pizza);
                break;
            case 4:
                orderDone = true;
                break;
        }
    }

    private static void selectPizzaType() {
        System.out.println("Select your pizza type:\n1. Thin Crust Pizza\n2. Thick Crust Pizza");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                pizza = new ThinCrustPizza();
                break;
            case 2:
                pizza = new ThickCrustPizza();
                break;
        }
    }

    private static void showMenu() {
        System.out.println("Add toppings:");
        System.out.println("1. Chesse\n2. Olives\n3. Peppers");
        System.out.println("Or press 4 to finish order");
    }

    private static void showPizza() {
        System.out.println("This is your pizza!");
        System.out.println(pizza.getDescription());
    }
}
