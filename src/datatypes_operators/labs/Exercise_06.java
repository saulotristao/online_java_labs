package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 6: 2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        int[][] twoDArray = new int[5][5];
        int multiple = 3;
        for ( int rows = 0; rows < twoDArray.length; rows++){
            for (int cols = 0; cols < twoDArray[rows].length; cols++){
                 twoDArray [rows][cols] = multiple;
                 multiple+=3;
            }
        }

        for ( int rows = 0; rows < twoDArray.length; rows++){
            for (int cols = 0; cols < twoDArray[rows].length; cols++){
                System.out.print(twoDArray [rows][cols] + "|");
            }
            System.out.println();
        }
    }
}
