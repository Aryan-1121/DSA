public class FloornCeil {


public static void main(String[] args) {
    
    int a[] ={3, 4, 7, 8, 8, 10};
    int x= 5; 
    int n =6;
    int[] ans =getFloorAndCeil(a, n,x);

    for (int elemnent: ans){
        System.out.println(elemnent);
    }
}


    public static int[] getFloorAndCeil(int[] a, int n, int x) {


        int f = floor(a, n, x);
        int c = ceil(a, n, x);
        int[] ans = { f, c };

        return ans;
    }

  private static int floor(int[]a , int n ,int x){
    int f=-1; 
    int low=0; 
    int high =n-1;  
    while (low <= high ){
        int mid = low + (high - low )/2;
        if(a[mid] <= x){
          f = a[mid]; 
          low = mid +1; 
          }
          else 
            high = mid -1; 

        }
        return f; 
    }


static int ceil(int[] a, int n, int x) {
    int ceiling = -1;
    int low = 0, high = n - 1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (a[mid] >= x) {
            ceiling = a[mid];
            high = mid - 1;
        } else
            low = mid + 1;
        }
        return ceiling;
}


}
