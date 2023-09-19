package Leetcode.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
    public static void main(String[] args) {
        int [] nums={2,6,5,8};
        int target= 14;
        System.out.println("Array - "+Arrays.toString(nums));
        System.out.println("ans is - "+Arrays.toString(findTwoSum(nums, target)));

    }

    // private static int[] findTwoSum(int[] nums, int target){

    //     int [] ans=new int[2];
    //     int  n=nums.length;
    //     for(int i=0; i<n ;i++){
    //         ans[0]=i;
    //         for(int j=i+1 ;j<n; j++){
    //             if(nums[i]+nums[j] == target){
    //                 ans[1]=j;
    //                 return ans;
    //             }
    //         }
    //     }
    //     return ans; 

    // }


    private static int[] findTwoSum(int[] nums, int target){
        Map<Integer,Integer> map= new HashMap<>();
        int n=nums.length;
        for(int i=0; i<n; i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]), i};
            }
            else 
                map.put(nums[i],i);
        }
        return null;
    }
    
}
