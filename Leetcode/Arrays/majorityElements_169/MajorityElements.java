package Leetcode.Arrays.majorityElements_169;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class MajorityElements {
    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};

        System.out.println("Array - "+Arrays.toString(nums));
        System.out.println("Majority Element is= "+findMajorityElement(nums));
    }
    
    // private static int findMajorityElement(int[] nums){
    //     Map<Integer, Integer> elementCounter = new HashMap<>();
// 
    //     for(int element:nums){
    //         if(elementCounter.containsKey(element))
    //             elementCounter.put(element, elementCounter.get(element)+1);
// 
    //         else
    //             elementCounter.put(element, 1);
    //     }
// 
    //     int check = nums.length/2;
// 
    //     Iterator<Map.Entry<Integer, Integer>> itr = elementCounter.entrySet().iterator();
// 
    //     while(itr.hasNext()){
    //         Map.Entry<Integer,Integer> entry = itr.next();
    //         if(entry.getValue()>check)
    //             return entry.getKey();
    //     }
// 
    //     return 0;
    // }


    // Moors voting algo - > if some element is present more than n/2 then it will not get cancelled with other elements
    

    private static int findMajorityElement(int[] nums){
        int element=nums[0];
        int count =0;
        int n=nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]==element)
                count++;
            else    
                count--;
            
            if(count==0){
                element=nums[i+1];
            }
        }
        if(count!=0){
            int counter=0;
            for(int x : nums){
                if(x==element)
                    counter++;
                if(counter>n/2)
                    return element;
            }
        }
        return -1;
    }
}
