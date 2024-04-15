
class MinInRotSortArr {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0, high = n - 1;

        int min = Integer.MAX_VALUE;
        // [8, 3, 4, 5, 6, 7 ]
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // if array is sorted then don't need to do BS, just compare min with nums[low]'
            if (nums[low] <= nums[high]) {
                min = (nums[low] < min) ? nums[low] : min;
                break;
            }
            // check which part of array is sorted
            if (nums[low] <= nums[mid]) { // left part is sorted
                // find the minimum(left most element of sorted array will always be minimum)
                // and shrink the array
                min = Math.min(min, nums[low]);
                // if(nums[low] < min){
                // min = nums[low];
                // }
                low = mid + 1;

            } else { // right part is sorted
                min = (nums[mid] < min) ? nums[mid] : min;
                high = mid - 1;
            }
        }
        return min;
    }
}
