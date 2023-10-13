package Leetcode.Arrays.subArraySumK_560;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubarraySum {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println("Array = "+ Arrays.toString(nums));
        int k =3; 

        // System.out.println("no. of sub array sum equals to  K = "+ subarraySum(nums, k));
        System.out.println("no. of sub array sum equals to  K = "+ subarraySum2(nums, k));

    }

    private static int subarraySum(int[] nums, int k){

        int count=0; 
        int n=nums.length;
        for(int i=0; i<n; i++) {
            int sum=0;
            for(int j=i; j<n ;j++){
                sum+=nums[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }
    
    private static int subarraySum2(int[] nums, int k){

        int count=0; 
        int prefixSum=0;
        Map<Integer, Integer> freqMap = new HashMap<>();
        freqMap.put(0,1);
        // for(int element : nums){
        //     prefixSum+=element;
        //     if(freqMap.containsKey(prefixSum- k )){
        //         count+=freqMap.get(prefixSum- k);
        //     }
        //     if(freqMap.containsKey(prefixSum)){
        //         freqMap.replace(prefixSum, freqMap.get(prefixSum)+1);
        //     }
        //     else{
        //         freqMap.put(prefixSum, 1);
        //     }
        // }


        for(int element : nums){
            prefixSum+=element;

            count+= freqMap.getOrDefault(prefixSum-k, 0);

            freqMap.put(prefixSum, freqMap.getOrDefault(prefixSum, 0)+1);
        }
        return count;
    }
}
