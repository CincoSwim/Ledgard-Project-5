/*
  EECS 1510 Object-Oriented Programming
  Project 5 Part 4
  Written by Christopher Pucko

  Asks for an odd number between 1 and 20, then creates a pyramid of that many lines.
  As an added bonus, a second mode is unlocked after a pyramid is made, that works with any integer input above 0.
 */

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int lines;
        String quitDialog;
        Scanner input = new Scanner(System.in);

        lines = 0;

        System.out.println("Welcome to the Game of Triangle!");

        while (lines < 1 || lines > 20) {
            System.out.print("Please enter an odd number [1-20]: ");
            lines = input.nextInt();
            if (lines < 1 || lines > 20)
                System.out.println("The number must be odd numbers between 1 and 20.");
        }

        System.out.println("Thanks, here is the triangle with " + lines + " rows.");

        //Creates a triangle with space buffer on either side.
        for (int i = 1; i < lines * 2; i += 2) {

            for (int k = 0; k < (lines - i / 2); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");


        }
        System.out.print("Thank you for playing! Would you like to try Advanced Mode? (Y/N)");
        quitDialog = input.next();

        //Begins Advanced Mode. This is the same as above, except without the [1-20] limiter.
        while (quitDialog.equals("Y") || quitDialog.equals("y")) {
            System.out.print("Great! Please input ANY number: ");

            lines = input.nextInt();

            System.out.println("Thanks, here is the triangle with " + lines + " rows.");

            for (int i = 1; i < lines * 2; i += 2) {

                for (int k = 0; k < (lines - i / 2); k++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            System.out.println("Great! All finished! Would you like to go again? (Y/N):");
            quitDialog = input.next();
        }
        System.out.println("Okay! See you next time!");
    }
}

