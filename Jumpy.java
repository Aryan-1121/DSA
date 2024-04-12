import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Jumpy {

    public static void main(String[] args) {

        // int n = 5;
        int n=2 ;
        // int[] heights = {5,5};

        List<Integer> arr = new ArrayList<>();
        // for (int i = 0; i < n; i++)
        //     arr.add(scanner.nextLong());
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(8);
        arr.add(6);
        List<Long> nxt = new ArrayList<>(Collections.nCopies((int) n, 0L));

        Stack<Integer> s = new Stack<>();
        s.push(0);

        for (int i = 1; i < n; i++) {
            while (!s.isEmpty() && arr.get(i) > arr.get(s.peek())) {
                nxt.set(s.peek().intValue(), (long) i);
                s.pop();
            }
            s.push( i);
        }

        while (!s.isEmpty()) {
            nxt.set(s.peek().intValue(), -1L);
            s.pop();
        }

        List<Integer> dp = new ArrayList<>(Collections.nCopies((int) n, 0));
        long ans = 0;

        for (int i = (int) n - 1; i >= 0; i--) {
            if (nxt.get(i) == -1) {
                dp.set(i, arr.get(i));
                ans = Math.max(ans, dp.get(i));
                continue;
            }

            dp.set(i, arr.get(i) ^ dp.get(nxt.get(i).intValue()));
            ans = Math.max(ans, dp.get(i));
        }

        System.out.println(ans);
        // scanner.close();
    }
}