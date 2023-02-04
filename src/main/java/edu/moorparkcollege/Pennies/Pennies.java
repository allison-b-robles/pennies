package edu.moorparkcollege.pennies;

import java.util.Scanner;

/**
 *
 * @author allisobernalx
 */
public class Pennies {

    public static void main(String[] args) {
        /* Constants */   
        double dailySalary = .01;
        
        /* Declared Variables */
        double totalSalary = 0;
        int daysWorked;
        int i = 0;
        
        /* Initialize Scanner Class */
        Scanner data = new Scanner(System.in);
        
        /* Number of days */
        System.out.print("Enter Number of Days: ");
        /* Save Mortgage Amount */
        daysWorked = data.nextInt();
        int[] days = new int[daysWorked];
        
        /* Creating Table */
        System.out.print("         Day     Total\n");
        System.out.print("-----------------------------------------\n");
       
        for (i=1; i<days.length; i++) {
            System.out.print("Day "+ i);
            totalSalary += dailySalary;
            System.out.printf("%8.2f", dailySalary);
            System.out.printf("%8.2f\n", totalSalary);
            dailySalary *= 2;
        }
    }
}
