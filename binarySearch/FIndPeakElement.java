// https://leetcode.com/problems/find-peak-element/

// https://www.naukri.com/code360/problems/find-peak-element_1081482


class Solution {
    // 1st  - linear search 
    // 2nd - BS 
    public int findPeakElement(int[] nums) {
         int n= nums.length; 
        //  if arr haas only single element 
         if(n==1)
            return 0; 
            // if 1st element is greater than 2nd element 
        if(nums[0] > nums[1])
            return 0;
            // if last element is greater than 2nd last element 
        if(nums[n-1] > nums[n-2])
            return n-1; 

        int low = 1, high =n-2; 

        while (low <= high ){

            int mid = low + (high - low) /2; 
            // if mid element is greater than its adjecents
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1])
                return mid ;
            // mid element is on increasing slope => peak is on the right => eliminate left part 
            else if(nums[mid] > nums[mid-1])
                low = mid+1; 

                //             // if mid is in decreasing slope -> peak is on the left par t=> eleminate the right half

            else
                high = mid -1; 

        }
        return -1; 
    }
}
