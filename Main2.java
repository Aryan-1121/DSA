import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long[][] cnt = new long[n + 1][30]; // Max length is 1e5, so log2(1e5) is less than 30

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            for (int j = 0; j < 30; j++) {
                cnt[i + 1][j] = cnt[i][j] + Math.max(0, (1 << j) - (x & ((1 << (j + 1)) - 1)));
            }
        }

        int q = scanner.nextInt();
        while (q-- > 0) {
            int l = scanner.nextInt() - 1;
            int r = scanner.nextInt();
            long ans = Long.MAX_VALUE;
            for (int i = 0; i < 30; i++) {
                ans = Math.min(ans, cnt[r][i] - cnt[l][i]);
            }
            System.out.println(ans);
        }

        scanner.close();
    }
}
