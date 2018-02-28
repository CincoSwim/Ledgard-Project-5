/*
  EECS 1510 Object-Oriented Programming
  Project 5 Part 1
  Written by Christopher Pucko

  Uses JOptionPane frames to ask the user for the names and ages of any number of individuals until the string
  "quit" is entered. Then, the name of the oldest person in that list is outputted.
*/
import javax.swing.*;
import java.util.*;

public class Oldest {
    static int ageCompare;
    static String ageAsString;
    static String nameCurrentHighest;
    static String nameCompare;

    //Creates dialog for Name input
    public static class NameInput {
        JFrame f;

        NameInput() {
            f = new JFrame();
            nameCompare = JOptionPane.showInputDialog(f, "Enter a Name, or \"quit\" if finished. ");
        }
    }
    //Creates dialog for Age input, then parses an interger from the input.
    public static class ageInput {
        JFrame f;

        ageInput() {
            f = new JFrame();

            ageAsString = JOptionPane.showInputDialog(f, "Enter this person's age:");
            ageCompare = Integer.parseInt(ageAsString);
        }
    }
    //Displays the oldest person's age.
    public static class displaysOldest {
        JFrame f;

        displaysOldest() {
            f = new JFrame();
            JOptionPane.showMessageDialog(f, "The oldest person is " + nameCurrentHighest);
        }
    }

    public static void main(String[] args) {
        int ageCurrentHighest;
        String quitCondition;

        quitCondition = "quit";
        ageCurrentHighest = 0;

        while (!Objects.equals(nameCompare, quitCondition)) {
            new NameInput();

            if (Objects.equals(nameCompare, quitCondition))
                break;
            else
                new ageInput();

            if (ageCompare > ageCurrentHighest) {
                ageCurrentHighest = ageCompare;
                nameCurrentHighest = nameCompare;
            }
        }

        new displaysOldest();
        System.exit(0);
    }
}

