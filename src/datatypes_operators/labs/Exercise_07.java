package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 7: Irregular Arrays
 *
 *      Create and populate an irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_07 {
//    public static void main(String[] args) {
//        int numberOfRows = 4;
//        int[][] irreg_array;
//        int rename = 1;
//
//        for ( int rows = 0; rows < numberOfRows; rows++){
//            for (int cols = 0; cols < rows; cols++){
//                irreg_array = new int[numberOfRows][rows];
//                irreg_array [rows][cols] = rename;
//                System.out.print(irreg_array [rows][cols] + "|");
//                rename+=1;
//            }
//            System.out.println();
//        }
//    }

    public static void main(String[] args) {
        int[][] irreg_array = new int[4][];
        int count = 1;

        for ( int i = 0; i < irreg_array.length; i++){
            int[] arr = new int[i+1];
            irreg_array[i] = arr;
            for (int x = 0; x < irreg_array[i].length; x++){
                irreg_array [i][x] = count;
//                System.out.print(irreg_array [i][x] + "|");
                count++;
            }
//            System.out.println();
        }
        for (int b= 0; b < irreg_array.length; b++) {
            for (int i : irreg_array[b]) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

}
