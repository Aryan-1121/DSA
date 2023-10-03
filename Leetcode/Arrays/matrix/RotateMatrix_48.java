package Leetcode.Arrays.matrix;

public class RotateMatrix_48 {
    public static void main(String[] args){
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};

        printMat(matrix);

        // rotate(matrix);
        System.out.println("-----------------");
        // printMat(rotate(matrix));

        System.out.println("-----------");
        rotate2(matrix);
    }


    private static void printMat(int[][] matrix){
        for(int[] mat: matrix){
            for(int i: mat){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    private static int[][] rotate(int[][] matrix){
        int n=matrix.length;

        int [][] ans= new int [n][n];
        for(int i =0 ; i<n; i++){
            for(int j=0; j<n ; j++){
                ans[j][n-1-i]= matrix[i][j];
            }
        }
        return ans;
    }

    private static void rotate2(int[][] matrix){
        int n=matrix.length;

        for(int i=0; i<n-1; i++){
            for(int j =i+1; j<n ; j++){
                // swapping logic via xor
                matrix[i][j] = matrix[i][j] ^ matrix[j][i] ^ (matrix[j][i] = matrix[i][j]);
            }
        }
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }

        printMat(matrix);
        
        
    }


}
