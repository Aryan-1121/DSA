package Leetcode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementsN3_229 {
    public static void main(String[] args){
        int[] nums={2,2};
        System.out.println("Array = "+ Arrays.toString(nums));
        // System.out.println("majority element n/3 = "+ majorityElement(nums));
        System.out.println("majority element n/3 = "+ majorityElement2(nums));

    }

    // tc = o(n^2)
    private static List<Integer> majorityElement(int[] nums){
        List<Integer> ans= new ArrayList<>();
        int n=nums.length;
        // int mini= Math.floor(n);
        for(int i=0; i<n; i++){
            int count=0;
            for(int j=0; j<n; j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>n/3 && !ans.contains(nums[i]))
                ans.add(nums[i]);
        }
        return ans;
    }
    
    
    private static List<Integer> majorityElement2(int[] nums){
        List<Integer> ans= new ArrayList<>();
        Map<Integer, Integer> freqMap= new HashMap<>();

        int n=nums.length;

        for(int i=0; i<n; i++){
            int value = freqMap.getOrDefault(nums[i], 0);
            freqMap.put(nums[i], value+ 1);

            if(freqMap.get(nums[i])>n/3 && !ans.contains(nums[i]))
                ans.add(nums[i]);

            if(ans.size()==2)
                return ans; 
        }
        return ans;
    }

    private static List<Integer> majorityElement3(int[] nums){
        List<Integer> ans= new ArrayList<>();
        int n =nums.length; 
        int count1=0, count2=0; 
        int element1=Integer.MIN_VALUE;
        int element2=Integer.MIN_VALUE;

        for(int i=0; i< n; i++){
            if(count1 ==0  && element2!=nums[i]){
                count1=1;
                element1=nums[i];
            }
            else if(count2==0 && element1!=nums[i]){
                count2=1; 
                element2=nums[i];
            }
            else if(nums[i]==element1){
                count1++;
            }
            else if(nums[i]== element2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0; 
        count2=0;
        for(int i : nums){
            if(element1 == i)
                count1++;
            if(element2 == i)
                count2++;
        }

        if(count1> n/3)
            ans.add(element1);
        if(count2 > n/3){
            ans.add(element2);
        }
        
        return ans;
    }
}


//  public List<Integer> majorityElement(int[] nums) {
//         List<Integer> ans= new ArrayList<>();
//         Map<Integer, Integer> freqMap= new HashMap<>();
//         int n=nums.length;
//         for(int i=0; i<n; i++){
//             if(freqMap.containsKey(nums[i]))
//                 freqMap.put(nums[i], freqMap.get(nums[i])+1);      
//             else 
//                 freqMap.put(nums[i], 1);
//             if(freqMap.get(nums[i])>n/3 && !ans.contains(nums[i]))
//                 ans.add(nums[i]);
                
//             if(ans.size()==2)
//                 return ans; 
//         }
//         return ans;
//     }