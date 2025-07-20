package Leetcode.funwitharrays;

public class MaxConsecutiveOnes {

  public static void main(String[] args) {
    int[] arr = { 1, 1, 0, 0, 1, 1, 1 };

    System.out.println("max consicutive ones = " + getMaxOnes(arr));
    System.out.println("max consicutive ones = " + getMaxOnes(new int[] { 1 }));
    System.out.println("max consicutive ones = " + getMaxOnes(new int[] { 1, 0, 0, 0, 0, 1, 1, 1, 1, 1 }));
    System.out.println("max consicutive ones = " + getMaxOnes(new int[] { 1, 1, 1, 1, 0, 0, 0, 0, 1, 1 }));
    System.out.println("max consicutive ones = " + getMaxOnes(new int[] {}));
  }

  public static int getMaxOnes(int[] arr) {

    int s = 0, f = 0, temp = 0, max = 0;
    int n = arr.length;

    for (int i = 0; i < n; i++) {
      if (arr[f] == 1) {
        s = f;
        temp++;
        max = Math.max(max, temp);
      } else {
        temp = 0;
      }
      f++;
    }

    return max;
  }
}
