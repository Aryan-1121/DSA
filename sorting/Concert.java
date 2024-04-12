package sorting;

import java.util.*;

public class Concert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Number of groups
        int m = scanner.nextInt(); // Auditorium capacity

        int[][] bookings = new int[n][2]; // Array to store groups

        // Input the groups
        for (int i = 0; i < n; i++) {
            int entry = scanner.nextInt();
            int exit = scanner.nextInt();
            bookings[i][0] = entry;
            bookings[i][1] = exit;
        }

        // Sort the groups based on exit time
        Arrays.sort(bookings, Comparator.comparingInt(a -> a[1]));

        // Check if all groups can be accommodated
        boolean canAccommodate = true;
        int currentCapacity = 0;
        for (int[] booking : bookings) {
            if (currentCapacity + booking[0] > m) {
                canAccommodate = false;
                break;
            }
            currentCapacity += booking[1] - booking[0];
        }

        // Output the result
        System.out.println(canAccommodate ? "YES" : "NO");

        scanner.close();
    }
}
