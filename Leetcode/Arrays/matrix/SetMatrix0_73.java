package Leetcode.Arrays.matrix;

public class SetMatrix0_73{

    public static void main(String[] args){
     int[][] matrix= {{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        printMatrix(matrix);
        System.out.println("-----------------");

        // setZeroes2(matrix);
        setZeroes3(matrix);

        printMatrix(matrix);
        // setZeroes(matrix);

    }

    private static void printMatrix(int[][] mat){
    for(int[] row : mat){
            for(int element : row){
                System.out.print(" "+element+" ");
            }
            System.out.println();
        }
    }

    private static void setZeroes(int[][] matrix ){
     int rows=matrix.length;
     int cols = matrix[0].length;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols ;j++){
                if(matrix[i][j]==0){
                    markRow(matrix, j, rows);
                    markCol(matrix, i, cols);
                }
            }
        }


        for(int i=0; i<rows; i++){
            for(int j=0; j<cols ;j++){
                if(matrix[i][j]==-1){
                   matrix[i][j]=0;
                }
            }
        }
        printMatrix(matrix);
    }

    private static void markRow(int[][] mat, int j, int rows) {
        for(int i=0; i<rows; i++){
            if(mat[i][j]!=0){
                mat[i][j]=-1;
            }

        }
    }

    private static void markCol(int[][] mat, int i , int cols){
        for(int j=0; j<cols; j++){
            if(mat[i][j]!=0){
                mat[i][j]=-1;
            }
        }
        
    }

    private static void setZeroes2(int [][] matrix){
        int rows = matrix.length;
        int cols= matrix[0].length;

        boolean [] r= new boolean[rows];
        boolean [] c= new boolean[cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j]== 0){
                    r[i]=true;
                    c[j]=true;
                }
            }
        } 

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(r[i]== true || c[j]==true){
                    matrix[i][j]=0;
                }
            }
        }
        
        
    }

private static void setZeroes3(int [][] matrix){
        int col0=1;
        int rows = matrix.length;
        int cols= matrix[0].length;


        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    if(j!=0)
                        matrix[0][j]=0;
                    else 
                        col0=0;
                }
            }
        }

        for(int i=1; i<rows; i++){
            for (int j=1; j<cols; j++){
                if(matrix[0][j]==0 || matrix[i][0]==0)
                    matrix[i][j]=0;
            }
        }

        if(matrix[0][0]==0){
            for(int j=0;j<cols; j++){
                matrix[0][j]=0;
            }
        }

        if(col0==0){
            for(int i=0; i<rows ; i++){
                matrix[i][0]=0;
            }
        }
        
    }



}