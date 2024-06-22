package arrays.sorterarray;

// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
public class IsRotatedArraySorted {

  private static boolean isSorted(int[] arr) {
    int countSortingFails = 0;
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      // if count increases more than 1 then it fails
      if (arr[i] > arr[i + 1]) {
        countSortingFails++;
      }
    }
    // checking the same for 1st and last element
    if (arr[0] < arr[n - 1]) {
      countSortingFails++;
    }
    System.out.println(countSortingFails);
    return countSortingFails <= 1;
  }


  public static void main(String[] args) {
    int arr[] = { 3, 4, 5, 1, 2 };

    System.out.println("array is sorted = " + isSorted(arr));

  }
}
