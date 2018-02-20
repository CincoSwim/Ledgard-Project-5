import javax.swing.*;
import java.util.*;

public class Oldest {
    static int ageCurrentHighest;
    static String ageAsString;
    static int ageCompare;
    static String nameCurrentHighest;
    static String nameCompare;
    static String quitCondition;

    public static class NameInput {
        JFrame f;

        NameInput() {
            f = new JFrame();
            nameCompare = JOptionPane.showInputDialog(f, "Enter a Name, or \"quit\" if finished. ");
        }
    }

    public static class ageInput {
        JFrame f;

        ageInput() {
            f = new JFrame();

            ageAsString = JOptionPane.showInputDialog(f, "Enter this person's age:");
            ageCompare = Integer.parseInt(ageAsString);
        }
    }

    public static class displaysOldest {
        JFrame f;

        displaysOldest() {
            f = new JFrame();
            JOptionPane.showMessageDialog(f, "The oldest person is " + nameCurrentHighest);
        }
    }

    public static void main(String[] args) {
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

