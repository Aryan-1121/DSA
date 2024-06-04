package Leetcode.singleNumber_136;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SingleNumber {
    public static void main(String[] args){
        int[] nums={4,1,2,1,2};

        System.out.println("Array -> "+Arrays.toString(nums));
        System.out.println("non repeating no. is - "+singleNumber(nums));
    }

    // private static int singleNumber(int[] nums){
    // int ans = 0;
    // Set<Integer> set = new HashSet<>();
    // for (int i : nums) {
    // if (!set.contains(i)) {
    // set.add(i);
    // }
    // }
    // // for(int e : set){
    // // System.out.println(e);
    // // }

    // Iterator<Integer> iterator = set.iterator();
    // while (iterator.hasNext()) {
    // // since we will have only one element in set as their is only 1 no. that
    // isn't duplicated (acc. to Qs)
    // ans = iterator.next();
    // }
    // return ans;
    // }

    // xor to 2 same no. is zero & xor of a no. with zero is the no. itself

    private static int singleNumber(int[] nums){
        int xor = 0;
        for (int i : nums) {
            xor ^= i;
        }
        return xor;
    }
    
}
