package ArraysAndString;

public class RotateMatrix {
    public static void rotateMatrix(int[][] matrix)
    {
        if(matrix == null || matrix.length != matrix[0].length )
            return;
        //transpose
        for(int i=0;i<matrix.length;i++)
        {
            for (int j=i+1;j<matrix.length;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse
        for(int i=0;i<matrix.length;i++)
        {
            int start = 0;
            int end = matrix.length -1;
            while (start < end)
            {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }
    public static void main(String[] args) {
       // int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
      //  int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] matrix = new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        System.out.println("Array before reverse:");
        printMatrix(matrix);
        rotateMatrix(matrix);
        System.out.println("Array after reverse:");
        printMatrix(matrix);
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
