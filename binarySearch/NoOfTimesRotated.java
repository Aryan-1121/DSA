class NoOfTimesRotated {
     //  the minimum element's index in rotated array will be the ans  

     public int findKRotation(int []arr){
        // Write your code here.
        int n  = arr.length; 
        int low = 0, high =n-1; 
        int ans =Integer.MAX_VALUE;
        int index =-1; 
        while (low <= high){
            int mid = low + (high- low )/2;
            if(arr[low] <= arr[high]){
                if (arr[low] < ans){
                    ans = arr[low];
                    index =low; 
                break;
                } 
            }
            // get the sorted half
            if(arr[low] <= arr[mid]){
                if(arr[low] < ans ){
                    ans = arr[low]; 
                    index = low; 
                }
                low = mid +1; 
            }
            else{
                if(arr[mid] < ans){
                    ans = arr[mid]; 
                    index =mid; 
                }
                high = mid -1; 
            }

        }
    
        return index; 
    }
}
