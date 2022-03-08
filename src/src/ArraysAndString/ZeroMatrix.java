package src.src.ArraysAndString;

import java.util.HashSet;
import java.util.Set;

public class ZeroMatrix {

    public static void main(String[] args) {

        int[][] matrix = new int[][]{{0,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,0 ,25}};
        System.out.println("Array before zeros:");
        printMatrix(matrix);
        zeroMatrix(matrix);
        System.out.println("Array after zeros:");
        printMatrix(matrix);

    }

    /**
     * This method sets matrix's row and column to 0
     * @param matrix
     */
    public static void zeroMatrix(int[][] matrix)
    {
        int rowLength = matrix.length;
        int columnLength = matrix[0].length;
        Set<Integer> rows = new HashSet<>();
        Set<Integer> columns = new HashSet<>();
        for(int i=0;i<rowLength;i++)
        {
            for (int j=0;j<columnLength;j++)
            {
                if(matrix[i][j] == 0)
                {
                    rows.add(i);
                    columns.add(j);
                }
            }
        }
        for(Integer row: rows)
        {
            for(int j=0;j<columnLength;j++)
            {
                matrix[row][j] = 0;
            }
        }
        for(Integer column: columns)
        {
            for(int i=0;i<rowLength;i++)
            {
                matrix[i][column] = 0;
            }
        }

    }

    private static void printMatrix(int[][] matrix) {
        for(int i=0;i<matrix.length;i++)
        {
            for (int j=0;j<matrix.length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
