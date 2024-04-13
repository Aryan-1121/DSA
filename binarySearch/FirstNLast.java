public class FirstNLast {
    // o(n)
// public int[] searchRange(int[] nums, int target) {
//         int first =-1; 
//         int last =-1; 
//         int n = nums.length;
//         for(int i=0; i<n; i++){
//             if(nums[i] == target){
//                 if(first == -1){
//                     first = i;
//                     last = i;
//                 }else {
//                     last = i;
//                 }
//             }
//         }
//         return new int[] {first, last};

//     }



    // o(logN)

// private int lowerBound(int[] nums, int n, int target){
//     int low = 0, high= n-1; 
//     int ans =n ;
//     while (low<=high){
//         int mid = low +(high-low)/2;
//         if (nums[mid] >= target ){
//             ans = mid; 
//             high =mid -1; 
//         }else{
//             low =mid+1; 
//         }
//     }
//     return ans; 
// }

// private int upperBound(int[] nums, int n , int target ){
//     int low = 0, high= n-1; 
//     int ans =n ;
//     while (low<=high){
//         int mid = low +(high-low)/2;
//         if (nums[mid] > target ){
//             ans = mid; 
//             high =mid -1; 
//         }else{
//             low =mid+1; 
//         }
//     }
//     return ans; 
// }

// public int[] searchRange(int[] nums, int target) {

//     int n = nums.length; 
//     int lb =lowerBound(nums,n, target );
//     // System.out.println(lb);
//     if(lb ==n || nums[lb] != target)
//         return new int[] {-1, -1};
//     return new int[] {lb, upperBound(nums, n, target)-1};

// }





            // o(logN)


private int firstPos(int[] nums, int n , int target){
    int low =0, high = n-1; 
    int first = -1; 
    while(low<= high){
        int mid = low +(high - low)/2;
        if(nums[mid] == target){
            first = mid; 
            high = mid-1; 
        }else if(nums[mid] < target){
            low = mid+1; 
        }else {
            high = mid -1; 
        }

    }
    return first; 
}

private int lastPos(int[] nums, int n , int target){
    int low =0, high = n-1; 
    int last = -1; 
    while(low<= high){
        int mid = low +(high - low)/2;
        if(nums[mid] == target){
            last = mid; 
            low = mid+1; 
        }else if(nums[mid] < target){
            low = mid+1; 
        }else {
            high = mid -1; 
        }
    }
    return last; 
}



 public int[] searchRange(int[] nums, int target) {

    int n = nums.length; 
    int first =firstPos(nums,n, target );
    if(first == -1)
        return new int[] {-1, -1};
    return new int[] {first, lastPos(nums, n, target)};

}
}