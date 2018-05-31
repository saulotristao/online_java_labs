package datatypes_operators.labs;

import java.util.Scanner;

/**
 * Data Types and Operators Exercise 4: Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_04{
    
    private static double sum;
    
    public static void main(String[] args) {
        double[] numbers = new double[10];

        for (int a = 0; a <numbers.length; a++){
            // create scanner
            Scanner scanner = new Scanner(System.in);
            // prompt user
            System.out.print("Enter the number in the position " + (a+1));
            // assign input to variable as double
            double number = scanner.nextDouble();
            // get the number
            numbers[a] = number;
            sum = sum + number;

        }
        System.out.println("the sum is " + sum);
        System.out.println("the average is " + sum/10);
    }

}