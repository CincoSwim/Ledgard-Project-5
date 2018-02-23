import java.util.Scanner;

public class CountingChange {

    public static voic main(String[] args) {
        int targetSum;
        int moneySum;
        int pennies;
        int nickels;
        int dimes;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number between 0 and 99: ");
        targetSum = input.nextInt();
        if (targetSum > 99 || targetSum < 0){
            System.out.println("Sorry, this is not between 0 and 99");
            System.exit(0);
        }


    }
}
