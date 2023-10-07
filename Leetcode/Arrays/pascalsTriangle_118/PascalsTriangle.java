package Leetcode.Arrays.pascalsTriangle_118;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter number of rows = ");
        // int numRow= sc.nextInt();
        int numRow=5;
        System.out.println("-----------------");
        // System.out.println(generate(numRow));
        System.out.println(generate2(numRow));
        // sc.close();

    }

    private static List<List<Integer>> generate(int numRows){

        List<List<Integer>> ans = new ArrayList<>();
        // row.add( 1);
        for(int i=1; i<=numRows; i++){
            List<Integer> row = new ArrayList<>();
            for(int j=1; j<=i; j++){
                System.out.print(nCr(i-1, j-1)+" ");
                row.add(nCr(i-1, j-1));
            }
            ans.add(row);
            System.out.println();
        }

        return ans;
    }

 private static int nCr(int n, int r){
        int ans=1;
        for(int i=0; i<r; i++){
            ans*=(n-i);
            ans/=(i+1);
        }
        return ans; 
    }

    

    private static List<List<Integer>> generate2(int numRows){
    List<List<Integer>> ans = new ArrayList<>();

        //store the entire pascal's triangle:
        for (int row = 1; row <= numRows; row++) {
            ans.add(generateRow(row));
        }
        return ans;
    }

   

    private static List<Integer> generateRow(int row){
        long ans=1;
        List<Integer> ansRow= new ArrayList<>();
        ansRow.add(1);
        // for(int i=0; i<r; i++){
        //     ans*=(n-i);
        //     ans/=(i+1);
        //     ansRow.add((int)ans);
        // }
        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            ansRow.add((int)ans);
        }
        return ansRow; 
    }
}
