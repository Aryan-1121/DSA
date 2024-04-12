import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Number of elements in the array
        int[] arr = new int[n]; // Array to store the elements

        // Input the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Initialize the count of operations
        int count = 0;

        // Iterate through the array to make it non-decreasing
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                // Increase the current element to make it non-decreasing
                count += arr[i - 1] - arr[i];
                arr[i] = arr[i - 1];
            }
        }

        // Output the minimum number of operations
        System.out.println(count);

        scanner.close();
    }
}
