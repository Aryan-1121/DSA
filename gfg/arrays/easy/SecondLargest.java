package gfg.arrays.easy;

public class SecondLargest {

  private static int secondLarge(int[] arr, int n) {
    if (n < 2) {
      return -1;
    }
    int largest = -1, secondLargest = -1;
    for (int i = 0; i < n; i++) {
      if (arr[i] > largest) {
        secondLargest = largest;
        largest = arr[i];
      } else if (arr[i] > secondLargest && arr[i] < largest)
        secondLargest = arr[i];
    }
    // System.out.println(largest+"  "+ secondLargest);

    return secondLargest;
  }

  public static void main(String[] args) {

    int[] arr = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };

    System.out.println(secondLarge(arr, arr.length));
  }
}
