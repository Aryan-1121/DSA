class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;         
        int low =0, high =n-1; 

        while (low <= high ){
            int mid = low + (high - low )/2; 
            if(nums[mid] == target )          //[3,1] , target =1
                return true; 
            if (nums[mid] == nums[low] && nums[mid] == nums[high]){
                low+=1; 
                high-=1;
                continue; 
            }
            if(nums[low] <= nums[mid]){          // if left part is sorted 
                if(nums[low] <= target && target <= nums[mid] ) // is target b/w low and mid 
                    high = mid -1; 
                else 
                    low = mid +1; 
            }
            else {
                if(nums[mid] <= target && target <= nums[high])     // target is in b/w mid and high 
                    low = mid+1; 
                else 
                    high = mid -1; 
            }
                
        }
        return false;
    }
}