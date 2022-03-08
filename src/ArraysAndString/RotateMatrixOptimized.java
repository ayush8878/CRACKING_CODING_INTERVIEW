package ArraysAndString;

public class RotateMatrixOptimized {
    public static void rotateMatrix(int[][] matrix)
    {
        if(matrix == null || matrix.length != matrix[0].length )
            return;
        int N = matrix.length;
        // Each layer need to be considered for rotations
        for(int x = 0; x < N/2;x++)
        {
            for(int y=0;y<N - x - 1;y++)
            {
                // Store TOP-LEFT in temp
                int temp = matrix[x][y];
                // Move bottom-left to top-left
                matrix[x][y] = matrix[N - 1 - x][x];
                // move bottom right to bottom-left
                //matrix[N - 1 - x][x] = matrix[N-1-x][]
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
