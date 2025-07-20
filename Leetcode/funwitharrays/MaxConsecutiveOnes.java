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

  public static int getMaxOnes(int[] nums) {

    int maxOnes = 0;
    int tempOnes = 0;
    for (int i = 0; i < nums.length; i++) {

      if (nums[i] == 1) {

        tempOnes++;
      } else {
          maxOnes = Math.max(maxOnes, tempOnes);
          tempOnes = 0;
        }
    }
    maxOnes = Math.max(maxOnes, tempOnes);
    return maxOnes;
  }
}
