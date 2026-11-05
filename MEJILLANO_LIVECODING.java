/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mejillano_livecoding;
import java.util.Scanner;

/**
 *
 * @author MEJILLANO_CPE113
 */
public class MEJILLANO_LIVECODING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner LC = new Scanner (System.in);

// ----- PROBLEM 1 ----- //        
        System.out.println("Please enter your scores: (PRELIMS, MIDTERMS, FINALS)");
        System.out.println("Prelims: ");
        double prelims = LC.nextDouble();
        System.out.println("Midterms: ");
        double midterms = LC.nextDouble();
        System.out.println("Finals: ");
        double finals = LC.nextDouble();
        
        System.out.println ("Average: " + calculateAverage (prelims, midterms, finals));
        System.out.println("Grade Equivalent: " + getGradeEquivalent (calculateAverage (prelims, midterms, finals)));
        System.out.println("Status: " + isPassed((int) calculateAverage (prelims, midterms, finals)));
        System.out.println("");
        
// ----- PROBLEM 2 ----- //

        System.out.println("Please enter your values: (Consumption, Rate)");
        System.out.println("Consumption: ");
        double CONSUMPTION = LC.nextDouble();
        System.out.println("Rate: ");
        double RATE = LC.nextDouble();
        System.out.println("Consumption Charge: " + calculateConsumptionCharge (CONSUMPTION, RATE) + " Pesos");

        System.out.println("Please enter the Additional Charge in percentage to calculate the Additional Charge in pesos: ");
        double charge = LC.nextDouble();
        System.out.println(calculateAdditionalCharge (calculateConsumptionCharge (CONSUMPTION, RATE), charge));
        
        System.out.println("Total Bill: " + calculateTotalBill (calculateConsumptionCharge (CONSUMPTION, RATE), calculateAdditionalCharge (calculateConsumptionCharge (CONSUMPTION, RATE), charge)));
        
// ----- PROBLEM 3 ----- //
        System.out.println("How many numbers?");
        int N = LC.nextInt();
        
        int ARRAY [] = new int [N];
        if (N <= 0) {
            System.out.println("Invalid.");
        } else {
        for (int i = 0; i < N; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            ARRAY [i] = LC.nextInt();
        }
        
        System.out.println("Sum: " + calculateSum (ARRAY));
        System.out.println("Ave: " + calculateAve (ARRAY));
        System.out.println("Max: " + findHighest (ARRAY));
        System.out.println("Min: " + findMinimum (ARRAY));
        System.out.println("Passed: " + countPassing (ARRAY));
        }
// ----- PUBLIC MAIN BRACKET ----- //        
    }   
    

    static double calculateAverage (double prelims, double midterms, double finals) {
        return prelims + midterms + finals / 3;
    }

    static char getGradeEquivalent (double average) {
        char result = 0;
        if (average >= 90 && average <= 100) {
            result = 'A';
        } else if (average >= 85 && average <= 89.99) {
            result = 'B';
        } else if (average >= 80 && average <= 84.99) {
            result = 'C';
        } else if (average >= 75 && average <= 79.99) {
            result = 'D';
        } else if (average < 75) {
            result = 'F';
        }
        return result;
    }

    static boolean isPassed (int average) {
       boolean Passed = true;
       if (average >= 75) {
           Passed = true;
       } else 
           Passed = false;
        return Passed;
    }

    static double calculateConsumptionCharge (double consumption, double rate) {
        return consumption * rate; 
    }

    static double calculateAdditionalCharge (double consumptionCharge, double charge) {
        double CHARGE = (charge / 100);
        return consumptionCharge * CHARGE;
    }
    
    static double calculateTotalBill (double consumptionCharge, double additionalCharge) {
        return consumptionCharge + additionalCharge;
    }

    static int calculateSum (int ARRAY []) {
        int sum = 0;
        for (int i = 0; i < ARRAY.length; i++) {
            sum += ARRAY [i];
        } return sum;
    }
    
    static double calculateAve (int ARRAY []) {
        double ave = 0;
        for (int i = 0; i < ARRAY.length; i++) {
            ave += ARRAY [i];
        } return ave / ARRAY.length;
    }
    
    static int findHighest (int ARRAY []) {
        int max = ARRAY [0];
        for (int i = 1; i < ARRAY.length; i++) {
            if (ARRAY [i] > max) {
                max = ARRAY [i];
    }
        }return max;
}
        
    static int findMinimum(int ARRAY[]) {
        int min = ARRAY[0];
        for (int i = 1; i < ARRAY.length; i++) {
            if (ARRAY[i] < min) {
                min = ARRAY [i];
            }
        }
        return min;
    }

    static int countPassing(int ARRAY[]) {
        int pass = 0;
        for (int i = 0; i < ARRAY.length; i++) {
            if (ARRAY[i] >= 75) {
                pass++;
            }
        }
        return pass;
    }







// ----- MAIN BRACKET ----- //
}
