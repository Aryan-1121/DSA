// package CodingNinjas.SuperiorElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args){
        int[] a={1,2,3,2};

        System.out.println("Araya = " + Arrays.toString(a));
        System.out.println("Superior elements - "+ findSuperiorElements(a));
    }

    private static List<Integer> findSuperiorElements(int[] a){
        int n =a.length;
        int max= a[n-1];
        List<Integer> ans= new ArrayList<>();
        ans.add(a[n-1]);
        for(int i = n-2; i>=0; i--){
            if(a[i]>max){
                ans.add(a[i]);
                max=a[i];
            }
        }
        return ans;
    }
}
