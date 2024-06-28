package arrays.removeduplicates;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {

  private static int uniqueElements(int[] arr) {
    Map<Integer, Integer> frequencyMap = new HashMap<>();

    for (int element : arr) {

      if (!frequencyMap.containsKey(element))
        frequencyMap.put(element, 1);
      else {
        frequencyMap.put(element, frequencyMap.get(element) + 1);
      }

    }
    return frequencyMap.size();

  }
  public static void main(String[] args) {
    int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

    System.out.println("no. of elements after removing duplicates = " + uniqueElements(arr));
  }
}
