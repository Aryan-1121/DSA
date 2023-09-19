package CodingNinjas.longestSubarrayWithSumK;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] a={8,15,2,0,11};
        long k=17;
        System.out.println("Array -> "+Arrays.toString(a));
        System.out.println("longest Subarray with sum k -> "+longestSubarrayWithSumK(a,k));
    }
    
    private static long longestSubarrayWithSumK(int[]a , long k){

        int len=0;
        long localSum=0;
        int count=0;
        int j=0;
        for(int i=0; i<a.length; i++){
            localSum+=a[i];
            count++;
            if(localSum==k && count>len){
                len=count;
            }
            else if(localSum>k){
                i=j++;
                localSum=0;
                count=0;  
            }
        }
        return len;
    }
}

