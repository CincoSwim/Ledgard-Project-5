/*
EECS 1510 Object-Oriented Programming
Project 5 Part 3
Written by Christopher Pucko

Prompts the user for an amount of money between 0 and 99 cents. The user is then asked to specify how many dimes,
nickels, and pennies are in this amount. If the monetary sum is equal, an affirmative is outputted. If the sum is
incorrect, then one more attempt is given before the program ends.
 */

import java.util.Scanner;

public class CountingChange {

    public static void main(String[] args) {

        int targetSum;
        int coinSum;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number between 0 and 99: ");
        targetSum = input.nextInt();
        if (targetSum > 99 || targetSum < 0) {
            System.out.println("Sorry, this is not between 0 and 99");
            System.exit(0);
        } else {
            coinSum = totalCoins();
            if (coinSum == targetSum)
                System.out.println("Yes");
            else {
                System.out.println("No");
                System.out.println("Please Try Again");
                coinSum = totalCoins();

                if (coinSum == targetSum)
                    System.out.println("Yes");
                else
                    System.out.println("No");

            }
        }
    }
    // Prompts the amount of each coin and finds the monetary sum, returning the value as (int) moneySum
    private static int totalCoins() {
        int moneySum;
        int p;
        int n;
        int d;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of pennies: ");
        p = input.nextInt();

        System.out.print("Please enter the number of nickels: ");
        n = input.nextInt();

        System.out.print("Please enter the number of dimes: ");
        d = input.nextInt();

        moneySum = p + (5 * n) + (10 * d);

        return moneySum;
    }
}
