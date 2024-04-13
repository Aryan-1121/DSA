class Solution {
    // public int search(int[] nums, int target) {
    //     int n = nums.length;
    //     // boolean flag = -1 ;
    //     for(int i=0; i< n; i++){
    //         if(nums[i] == target)
    //             return i ; 
    //     }
    //     return -1; 
    // }


    public int search(int[] nums, int target) {
        int n = nums.length;
        int low =0, high = n-1; 
        while (low <= high){
            int mid = low + (high - low) /2;
            
            if(target == nums[mid])
                return mid; 
                        
//  check which part is sorted and search for target in that part
            if(nums[low] <= nums[mid]){          // left part sorted            
            
                if(nums[low] <= target && target <= nums[mid]){         // target is b/w left and mid  => (eliminated right part)
                    high = mid -1 ;
                }else {
                    low = mid +1; 
                }
            }
            else{            // right part sorted
                if(nums[mid] <= target  && target<= nums[high]){        //target is b/w mid & right => (eliminated left part)
                    low = mid +1; 
                }else{
                    high = mid - 1; 
                }
            }
        }  
        return -1; 
    }
}
