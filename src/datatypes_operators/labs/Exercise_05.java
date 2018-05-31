package datatypes_operators.labs;

import java.util.Scanner;

/**
 * Data Types and Operators Exercise 5: More arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_05{

    private static int number;

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number from 1-10");
        // assign input to variable as double
        number = scanner.nextInt();
        // get the number and compare

        for (int a = 0; a <array.length; a++){
            if (array[a] == number){
                System.out.println("index of that element is " + a);
            }
        }
    }
}