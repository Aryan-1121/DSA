package Leetcode.Arrays.nextPermutation_31;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] a={3,5,6,4,1};

        System.out.println("Array - "+Arrays.toString(a));

        Helper helper =  new Helper();
        System.out.println(Arrays.toString(helper.findNextPermutation(a)));
    }
}

class Helper{
    public int[] findNextPermutation(int [] nums){
        int  n= nums.length;
        int index=-1;
        int mini= -1000;
        for(int i =n-2; i>=0 ; i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
            if(nums[i]>mini)
                mini=i;
        }
        if(index==-1)
            return reverse(nums, 0, n-1);
        // System.out.println("here ====================== \n index = "+index + "\n mini = "+mini);
        nums[index]= nums[mini]+nums[index];
        nums[mini]= nums[index]- nums[mini];
        nums[index]= nums[index]- nums[mini];

        reverse(nums, index+1, n-1);
        return nums;
    }

  public int[]  reverse(int [] arr, int start , int end ){
        while (start<end){
            arr[start]=arr[start]+arr[end]; 
            arr[end]=arr[start]-arr[end]; 
            arr[start]=arr[start]-arr[end];
            start++;
            end--;
        }
        return arr;
    }


    
}