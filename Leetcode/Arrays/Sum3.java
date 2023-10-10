package Leetcode.Arrays;

import java.util.*;

public class Sum3 {
    public static void main(String[] args){
        int[] nums= {-1,0,1,0};

        System.out.println("Array - "+Arrays.toString(nums));
        // System.out.println("3 sums -> \n"+ threeSum(nums));
        System.out.println("3 sums -> \n"+ threeSum2(nums));
    }

    private static List<List<Integer>> threeSum(int[] nums){

        Set<List<Integer>> st = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            Set<Integer> hs = new HashSet<>();
            for(int j=i+1; j<nums.length; j++){
                int third= -(nums[i]+ nums[j]);
                if(hs.contains(third)){
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(temp);
                    st.add(temp);
                }
                hs.add(nums[j]);
            }
        }
        List<List<Integer>> ans= new ArrayList<>(st);


        return ans;
    }

    private static List<List<Integer>> threeSum2(int[] nums){

        Arrays.sort(nums);
        int n= nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i< n; i++){
            if(i != 0 && nums[i] == nums[i-1])
                continue;
            int k=n-1;
            int j=i+1;
            while (j< k){
                int sum = nums[i] + nums[j]  + nums[k];
                if(sum< 0)
                    j++;
                else if(sum > 0 )
                    k--;
                else{
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j< k && nums[j] == nums [j-1])
                        j++;
                    while(j< k && nums[k] == nums[k+1])
                        k--;
                }
            }
        }
        return ans;
    }
}
