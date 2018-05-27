package datatypes_operators.labs;

import java.util.Scanner;

/**
 * Data Types and Operators Exercise 3: Pig latin
 *
 *      Take in the user's name and print out their name translated to pig latin.
 *      For the purpose of this program, we will say that any word or name can be
 *      translated to pig latin by moving the first letter to the end, followed by "ay".
 *      For example: ryan -> yanray, caden -> adencay
 *
 *      HINT: We will make use of the substring() method.
 */

public class Exercise_03 {

    private static String piglatin = "";

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a name ");
        // assign input to variable as string
        String name = scanner.nextLine();
        // get first letter
        char firstLetter = name.charAt(0);
        // print first letter
        System.out.println(firstLetter);
        int namelenght = name.length();
        // building the first part of piglatin
        for (int a = 1; a < namelenght; a++){
            piglatin += name.charAt(a);
        }
        // adding the first letter to the end
        piglatin += firstLetter;
        // concatenating
        System.out.println(piglatin+"ay");

    }
}


