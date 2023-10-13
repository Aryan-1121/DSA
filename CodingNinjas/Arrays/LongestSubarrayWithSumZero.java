package CodingNinjas.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumZero {
    public static void main(String[] args){

        int[] nums = {1,0,-1};
        System.out.println(" Array ="+ Arrays.toString(nums));
    
        System.out.println("Longest SUbarray with sum 0 = "+getLongestZeroSumSubarrayLength2(nums));

        // System.out.println("Longest SUbarray with sum 0 = "+getLongestZeroSumSubarrayLength(nums));
    }

    private static int getLongestZeroSumSubarrayLength(int[] arr){
        int longest = 0;
        int n =arr.length; 
        for(int i=0; i< n ;i++){
            int sum=0;
            for(int j=i; j<n ; j++){
                sum+=arr[j];
                if(sum== 0){
                    // System.out.println(longest);
                    longest= Math.max(longest, (j-i)+1);
                    // System.out.println(longest);
                }
                // System.out.println(longest);
            }
        }
        return longest;

    }

    private static int getLongestZeroSumSubarrayLength2(int[] arr){
        int longest=0;
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        int sum=0;
        for(int i=0; i<n ;i++){
            sum+=arr[i];
            if(sum==0)
                longest=i+1;
            else{
                if(map.containsKey(sum))
                    longest=Math.max(longest, i-map.get(sum));
                
                else
                    map.put(sum, i);
            }
        }        

        return longest;

    }


}


// 21
// 19 0 32 49 21 25 23 31 20 5 50 49 9 44 10 13 3 31 48 22 -1 

