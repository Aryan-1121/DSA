package arrays.removeduplicates;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// question needs to change the given array

public class Solution2 {

  private static int uniqueElements(int[] arr) {
    int count = 1;
    int n = arr.length;
    int j = 0;
    for (int i = 1; i < n; i++) {
      if (arr[j] == arr[i]) {
        i++;
      } else {
        j++;
        arr[j] = arr[i];
        i++;
        count++; 
      }
    }
    Arrays.stream(arr).forEach(System.out :: println);
    return count;

  }

  public static void main(String[] args) {
    int arr[] = { 0, 0, 1 };

    System.out.println("no. of elements after removing duplicates = " + uniqueElements(arr));
  }
}
