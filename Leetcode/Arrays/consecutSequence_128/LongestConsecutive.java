package Leetcode.Arrays.consecutSequence_128;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public static void main(String[] args){
        int[] nums= {0,3,7,2,5,8,4,6,0,1};

        System.out.println("Array - "+Arrays.toString(nums));

        System.out.println("longest consecutive sequence - " +findConsecuticeSeq(nums));
    }

    private static int findConsecuticeSeq(int[] nums){

        int length =1 ;
        Arrays.sort(nums);
        int cur=1;
        int n = nums.length;
        System.out.println("sorted Array -"+Arrays.toString(nums));
        if(n==0)
            return 0;
        int digit=nums[0];

        for(int i=1; i<n; i++){
            if(nums[i]==digit+1){
                digit=nums[i];
                cur++;
                length=Math.max(length , cur);
            }
            else if(nums[i]==digit){
                continue;
            }
            else {
                length=Math.max(length , cur);
                digit=nums[i];
                cur=1;
            }
        }
        return length;

    }

    private static int findConsecuticeSeq2(int[] nums){

        int n = nums.length;
        if (n == 0)
            return 0;
        int length=1;
        // sc - o(n)
        Set<Integer> set= new HashSet<>();

        // o(n)
        for(int element : nums)
            set.add(element);

        // o(2n)
        for(int element : set){
            if(!set.contains(element-1)){
                int count =1;
                int digit=element;
                while (set.contains(digit+1)){
                    digit+=1;
                    count+=1;
                }
                length= Math.max(length, count);
            }
        }
        return length;
    }
}
