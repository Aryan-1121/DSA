public class NoOfOccurance {


    private static int firstOccurance(int[] arr, int n, int x ){
        int low = 0, high =n-1; 
        int first = -1; 
        while (low <= high){
            int mid = low +(high - low )/2;

            if(arr[mid] == x){
                first = mid; 
                high = mid -1 ;
            }else if(arr[mid] < x){
                low = mid +1; 
            }else {
                high = mid -1 ;
            }
        }
        return first; 
    }
    
    private static int lastOccurance(int[] arr, int n, int x ){
        int low = 0, high =n-1; 
        int last = -1; 
        while (low <= high){
            int mid = low +(high - low )/2;

            if(arr[mid] == x){
                last = mid; 
               low = mid +1;
            }else if(arr[mid] < x){
                low = mid +1; 
            }else {
                high = mid -1 ;
            }
        }
        return last; 
    }

    public static int count(int arr[], int n, int x) {
        //Your code goes here

        int first = firstOccurance(arr, n, x);
        if (first == -1 )
            return 0;
        int last = lastOccurance(arr, n, x) ;

        return last - first +1; 
    }
}