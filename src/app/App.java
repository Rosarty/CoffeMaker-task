package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Drink> drinks = new ArrayList<>();
        drinks.add(new Espresso());
        drinks.add(new Cappuccino());
        drinks.add(new Latte());

        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Choose a drink:
                1 - Espresso,
                2 - Cappuccino,
                3 - Latte,
                Enter the number of the drink :
                """
        );
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= drinks.size()) {
            Drink selectedDrink = drinks.get(choice - 1);
            selectedDrink.prepare();
        } else {
            System.out.println("Invalid choice. Please choose a valid drink.");
        }

        scanner.close();
    }
}
