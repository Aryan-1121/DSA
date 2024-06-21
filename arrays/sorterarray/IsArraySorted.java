package arrays.sorterarray;

public class IsArraySorted {

  private static boolean isSorted(int[] arr) {
    // boolean sorted = true;
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 3, 4, 5, 6, 7 };

    System.out.println("array is sorted = " + isSorted(arr));

  }
}
