public class Sums2 {

  public static void main(String args[]) {
    int[] ans = twoSum2(new int[] { 3, 2, 4 }, 6);

    for (int i : ans) {
      System.out.print(i + " , ");
    }

  }

  public static int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target)
          return new int[] { i, j };
      }
    }
    return new int[2];
  }

  // optimized if array was sorteds

  private static int[] twoSum2(int[] nums, int target) {
    // 3, 2,4 
    int first = 0;
    int last = nums.length-1;
    while (first < last) {
      if (nums[first] + nums[last] == target) {
        return new int[] { first, last };
      } else if (nums[first] + nums[last] > target) {
        last--;
      } else {
        first++;
      }
    }
    return new int[2];
  }

}
