import java.util.*;

import javax.lang.model.util.ElementFilter;

public class matrix {





    public static void spiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        //borders

        while(startRow <= endRow && startCol <= endCol) {
            //top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j] + " ");
            }
            //right
            for(int i=startRow+1; i<=endRow; i++) {
                System.out.print(matrix[i][endCol]+ " ");
            }
            //bottom
            for(int j=endCol-1; j<=startCol; j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            //left
            for(int i=endRow-1; i>=startRow+1; i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();}


        public static int diagonalSum(int matrix[][]){
            int sum = 0;

            /*for(int i=0; i<matrix.length; i++){
                for(int j=0; j<matrix[0].length; j++){
                    if(i == j){
                        sum += matrix[i][j];
                    }
                    else if(i+j == matrix.length-1) {
                        sum += matrix[i][j];
                    }

                    
                }

            }*/
         for (int i=0; i<matrix.length; i++){
            //pd
            sum +=matrix[i][i];
            //sd
            if(i != matrix.length-1-i)
            sum += matrix[i][matrix.length-i-1];
         }
        
         return sum ;
        
    }


    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = 0, col = matrix.length-1;
        while(row<matrix.length && col>= 0) {
            if(matrix[row][col]==key){
                System.out.println("found key at (" + row + "," + col +")" );
                return true;
            }
            else if (key<matrix[row][col]) {
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args) throws Exception {
       /*  int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }*/

        int matrix[][] = {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};
        int key= 16;                
        staircaseSearch(matrix , key);
   
   
    }
}
