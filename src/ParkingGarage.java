/*
  EECS 1510 Object-Oriented Programming
  Project 5 Part 2
  Written by Christopher Pucko

  Asks the user for the time parked for 5 cars in a parking garage. Then, these times are used to calculate the total
  income for the garage, bearing in mind that the maximum daily charge is $12 and the minimum fee is $5, depending on
  time spent.
*/
import java.util.*;
import java.text.DecimalFormat;
import java.lang.Math;

public class ParkingGarage {
    public static void main(String[] args) {
        double hoursParked, chargedAmt;
        double chargeRunningTotal, hoursRunningTotal;

        String pattern, chargeFormatted;

        pattern = "$###,##0.00";

        Scanner input = new Scanner(System.in);
        DecimalFormat chargeFormat = new DecimalFormat(pattern);

        hoursRunningTotal=0;
        chargeRunningTotal=0;

        for (int i = 1; i < 6; i++) {
            System.out.print("Enter the hours parked for car " + i + ":   ");

            hoursParked = input.nextDouble();
            hoursRunningTotal +=hoursParked;

            // Comparators help calculate in regards to the garage's maximum fee and flat fee.
            if (hoursParked <= 2)
                chargedAmt = 5.00;
            else if (hoursParked >= 9)
                chargedAmt = 12.00;
            else
                chargedAmt = 5.0 + (Math.ceil(hoursParked) - 2);

            chargeRunningTotal += chargedAmt;
        }
            chargeFormatted = chargeFormat.format(chargeRunningTotal);

        System.out.println("Total Hours " + (float)hoursRunningTotal);
        System.out.println("Total Charge " + chargeFormatted);
    }
}


