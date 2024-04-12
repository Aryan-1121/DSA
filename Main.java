import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // int n =5; 
        // int k =9;
        // int[] arr = {1,4,9,3,6};



                // Input the non-negative integer k
        int n =scanner.nextInt();
        int k = scanner.nextInt();

        // Input the array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }



   
        int maxLength = 0;
        int sum = 0;
        int left = 0;



        for (int right = 0; right < n; right++) {
            sum += arr[right];

            // Shrink the window if the sum exceeds k
            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            // Update the maximum length of the subarray
            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println(maxLength);

        scanner.close();
    }
}



