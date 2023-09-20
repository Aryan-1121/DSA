package Leetcode.Arrays.sort0s1s2s_75;

import java.util.Arrays;

public class Sort0a1s2s {
    public static void main(String[] args) {
        int [] nums= {0,1,1,2,0,0,2,1,1,0,2,2,2,1,1,0};
        // int [] nums= {2};
// 
        System.out.println("Array - "+ Arrays.toString(nums));

 
        
        System.out.println("sorted Array -"+ Arrays.toString(sortArray(nums)));
    }

    private static int[] sortArray(int [] nums){

        int count0=0,count1=0, count2=0;
        for(int element : nums){
            if(element==0)
                count0++;
            else if (element==1)
                count1++;
            else if (element==2)
                count2++;
            else {
                System.out.println("there is another element than 0,1 and 2");
                break;
            }
        }
        System.out.println("count 0s = "+count0+"\n count 1 = "+count1+" \n count 2 = "+count2);

        for(int i=0; i<count0; i++)
            nums[i]=0;
        
        for(int i=count0; i<count0+count1; i++)
            nums[i]=1;
        for(int i=count0+count1; i<nums.length; i++)
            nums[i]=2;


        return nums;
    }

   
}



