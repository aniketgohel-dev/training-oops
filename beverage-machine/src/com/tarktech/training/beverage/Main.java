package com.tarktech.training.beverage;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        BeverageMachine beverageMachine = new BeverageMachine();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWhat beverage do you want (to refresh your morning)?");
        System.out.println("Please type Tea, Latte, Cappuccino or Mocha. Enter Done, if you feel refreshed!");

        String userInput = scanner.nextLine();

        while (!userInput.equals("Done")) {

            BeverageType beverageType = BeverageType.valueOf(userInput);

            String beverage = beverageMachine.dispenseBeverage(beverageType);
            System.out.println(beverage);

            int totalBeveragesDrunkByUser = beverageMachine.getDispensedBeverageCount(beverageType);
            System.out.println("You have drunk " + totalBeveragesDrunkByUser + " " + beverageType + " this morning!");

            int availableBeverageCount = beverageMachine.getAvailableBeverageCount(beverageType);
            System.out.println("There are " + availableBeverageCount + " more " + beverageType + " available.");

            String MostBeverageCount = beverageMachine.getMostFavouriteBeverageCount(beverageType);
            System.out.println("Most Favourite Bevrage is " + MostBeverageCount );
            String least = beverageMachine.getLeastFavouriteBeverageCount(beverageType);
            System.out.println("Least Favourite Bevrage is " + least );

            System.out.println("\nWhat beverage do you want (to refresh your morning)?");
            System.out.println("Please type Tea, Latte, Cappuccino or Mocha. Enter Done, if you feel refreshed!");

            userInput = scanner.nextLine();
        }

        System.out.println("Thank you! Visit again!");
    }
}
