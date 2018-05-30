package Arrays_Saulo;

public class ArraysLecture4 {

    public static void main(String[] args) {

        int[] colms = new int [10];
        int [] rows = new int [10];

        for (int i: rows){
            rows[i] = i + 64;
            System.out.println(rows[i]);
        }

        int [][] matrix = new int[9][10];


        for ( int rolls=0; rolls < matrix.length;rolls++){
            for (int colls =0 ; colls < matrix[rolls].length; colls++) {
                matrix[rolls][colls] = rolls + colls;
                System.out.print(matrix[rolls][colls]);
            }
            System.out.println();
        }
    }
}
