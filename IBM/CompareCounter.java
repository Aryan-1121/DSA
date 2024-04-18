package IBM;

public class CompareCounter {

    public static void main(String[] args) {
        int[] arr ={4,5,6,2,8,1,3};

        counterArray(arr, arr.length);

    }
    

    private static void counterArray(int[] arr, int n){

        int[] ans = new int[n];

        ans[0] = 0; 
        for(int i=0; i<n ; i++){
            int sum =0; 
            for (int j =0; j<i; j++){
                int element = arr[i] - arr[j];
                sum+=element; 
            }
            ans[i]= sum; 
        }

        for(int element : ans){
            System.out.println(element);
        }
     
        
    }

}
