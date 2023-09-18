package Leetcode.singleNumber_136;

import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args){
        int[] nums={4,1,2,1,2};

        System.out.println("Array -> "+Arrays.toString(nums));
        System.out.println("non repeating no. is - "+singleNumber(nums));
    }

    private static int singleNumber(int[] nums){
        int xor=0;
        for (int i:nums){
            xor^=i;
        }
        return xor;
    }
    
}
