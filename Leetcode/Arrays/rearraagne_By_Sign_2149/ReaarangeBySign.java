package Leetcode.Arrays.rearraagne_By_Sign_2149;

import java.util.Arrays;

public class ReaarangeBySign {
    public static void main(String[] args) {
        int[] a={18,-6,19,-26,15,-10,-9,-37,14,31};

        System.out.println("Array - "+Arrays.toString(a));
        System.out.println("Re-Arranged array - "+ Arrays.toString(reArranged(a)));
        
    }


    // won't work need  extra space
    //   {18,-6,19,-26,15,-10,-9,-37,14,31}
    // private static int[] reArranged(int[] nums){
    //     int n = nums.length;
    //     int po=0, ne=1;
    //     while (po<= n && ne <=n){
    //         if (po<n && nums[po]>=0){
    //             po+=2;
    //         }
    //         // System.out.println("po = "+po);
    //         if (ne< n && nums[ne]<0){
    //             ne+=2;
    //         }
    //         // System.out.println("ne = "+ne);    
    //         if( po <n && ne <n && nums[po]<0 && nums[ne]>=0 ){
    //             int temp = nums[po];
    //             nums[po]= nums[ne];
    //             nums[ne]=temp;
    //             po+=2;
    //             ne+=2;
     //         }
    //         if(po >= n || ne >= n ){
    //             break;
    //         }
    //     }
    //     return nums;  
    // }


    private static int[] reArranged(int[] nums){

        int n = nums.length;
        int [] ans= new int[n];
        int po=0;
        int ne=1;
        for(int element : nums)
        {
            if(element>=0){
                ans[po]=element;
                po+=2;
            }
            else {
                ans[ne]=element;
                ne+=2;
            }
        }
        return ans;
    }

}
