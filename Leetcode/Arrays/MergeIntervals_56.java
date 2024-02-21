package Leetcode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals_56 {
    public static void main(String[] args) {
        int[][] intervals= {{1,3}, {8,10}, {2,6}, {15,18}, {12,20}};

        for(int[] pair : intervals)
            System.out.print(Arrays.toString(pair)+"  ");

        System.out.println("after merging intervals : \n" );

        int [][] result = mergingIntervals(intervals);

        
        for(int[] pair : result)
            System.out.print(Arrays.toString(pair)+"  ");
    }



    private static int[][] mergingIntervals(int[][] intervals){
        
        int n = intervals.length;

        if(n==1)
            return intervals;
        
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b){
                return a[0]- b[0];
            }
            
        });

        // ORRRR

            // Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        //
        // System.out.println();
        // for(int[] pair : intervals)
        //     System.out.print(Arrays.toString(pair)+"  ");


        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i< n; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];

            if(!ans.isEmpty() && end<= ans.get(ans.size()-1).get(1)){
                continue;
            }

            for(int j=i+1; j<n; j++){
                if(intervals[j][0] <= end)
                    end = Math.max(end, intervals[j][1]);
                
                else
                    break;
            }
            ans.add(Arrays.asList(start, end));
        
        }
        int [][] result = new int[ans.size()][2];
        for(int i =0; i< ans.size(); i++){
            result[i][0] = ans.get(i).get(0);
            result[i][1] = ans.get(i).get(1);

        }

        return result;

        }
    }

