public class first
{
    public static void main(String[]args) {
        int[][] matrix;
        matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;
        for(int i = 0;i<matrix.length; i++)
        {
            for(int j = 0;j<matrix[i].length; j++)
            {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}

//ublic static void main(String[] args) {
//        int [] marks; // A 1-D Array
//        int [][] flats; // A 2-D Array
//        flats = new int [2][3];
//        flats[0][0] = 101;
//        flats[0][1] = 102;
//        flats[0][2] = 103;
//        flats[1][0] = 201;
//        flats[1][1] = 202;
//        flats[1][2] = 203;
//
//        // Displaying the 2-D Array (for loop)
//        System.out.println("Printing a 2-D array using for loop");
//        for(int i=0;i<flats.length;i++){
//            for(int j=0;j<flats[i].length;j++) {
//                System.out.print(flats[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println("");
//        }
//
//    }