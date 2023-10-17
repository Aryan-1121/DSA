package interviewBit;

import java.util.*;

public class SubArrayWithGivenXOR {
    public static void main(String[] args) {
        int[] A={4, 2, 2, 6, 4};
        int b = 6;
        System.out.println("Array = "+ Arrays.toString(A));
        // System.out.println("max xor subarray length ="+ maxLength(A, b));
        System.out.println("max xor subarray length ="+ maxLength2(A, b));
    }

    private static int maxLength(int[] A, int b){
        int n = A.length;
        int count =0; 
        for(int i=0; i<n ;i++){
            int sum=0;
                for(int j =i ;j<n; j++){
                sum=sum^A[j];
                if(sum==b){
                    count++;
                }
            }

        }
        return count; 
    }

    private static int maxLength2(int[] A, int b){
        int n = A.length;
        int count =0; 
        Map<Integer, Integer> map = new HashMap<>();
        int xr=0;
        map.put(xr,1 );
        for(int i=0; i<n; i++){
            xr= xr^A[i];
            int x = xr ^ b;
            if(map.containsKey(x)){
                count+=map.get(x);
            }
            if (map.containsKey(xr)) 
                map.put(xr, map.get(xr) + 1);
            else {
                map.put(xr,1);
            }
        }
        return count; 
    }
}
