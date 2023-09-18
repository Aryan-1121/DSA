package Leetcode.maxConsecutiveOnes_485;

import java.util.Arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1,0,1,1};
        System.out.println("Array - "+Arrays.toString(nums));
        System.out.println("max Consecutive ones - "+findMaxConsecutiveOnes(nums) );

    }

    static public int findMaxConsecutiveOnes(int[] nums) {

        int maxOnes=0; 
        int maxTempOnes=0;
        for(int i:nums){
            if(i==1){
                maxTempOnes++;
            }
            else{
                maxOnes=Math.max(maxOnes,maxTempOnes);
                maxTempOnes=0;
            }
        }
        if(maxTempOnes>maxOnes)
            maxOnes=maxTempOnes;
        return maxOnes;
    }

}
