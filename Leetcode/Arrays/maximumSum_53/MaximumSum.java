package Leetcode.Arrays.maximumSum_53;

import java.util.Arrays;

public class MaximumSum {
    public static void main(String [] args){
        int [] nums={-2,-3,-1};
        System.out.println("Array - "+Arrays.toString(nums));

        System.out.println("maximum subsarray sum = "+ findMaxSubarraySum(nums));
    }
    
    private static int findMaxSubarraySum(int[] nums){
        int sum=0;
        int maxi= Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0; i<n; i++){
            sum+=nums[i];      
            if(sum>maxi)
                maxi = sum;
            if(sum<0)
                sum=0;
        }

        return maxi;
    }
}


// TC - near about or little less than  O(N^3)
// SC - O(1)


// class Solution {
//     public int maxSubArray(int[] nums) {
//         int n = nums.length;
//         int maxi =Integer.MIN_VALUE; 
//         for (int i =0; i<n;  i++){
//             for (int j=i; j<n; j++){
//                 int sum =0; 
//                 for(int k=i; k<=j; k++){
//                     sum+=nums[k];
//                 }
//                 maxi= Math.max(maxi, sum);
//             }
//         }
//         return maxi;
//     }
// }


// TC - O(N^2)
// SC- O(1)

// class Solution {
//     public int maxSubArray(int[] nums) {
//         int n = nums.length;
//         int maxi =Integer.MIN_VALUE; 
//         for (int i =0; i<n;  i++){
//             int sum =0; 
//             for (int j=i; j<n; j++){
//                 sum+=nums[j];
//                 maxi= Math.max(maxi, sum);
//             }
//         }
//         return maxi;
//     }
// }


// TC - O(N) 
// SC - O(1)

// class Solution {
//     public int maxSubArray(int[] nums) {
//         int n = nums.length;
//         int sum=0; 
//         int maxi =Integer.MIN_VALUE; 
//         for (int i =0; i<n;  i++){
//             sum+=nums[i];
//             maxi= Math.max(maxi, sum);
//             if(sum<0)
//                 sum=0;
//         }
//         return maxi;
//     }
// }






























