package sorting;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    // static void bubble(int[] arr){

    // }

    static int[] funGame(int[] arr) {

        List<Integer> list = new ArrayList<>();

        for (int front = 0, last = arr.length - 1; front < arr.length && last >= 0;) {

            if (arr[front] > arr[last]) {

                list.add(1);

                last--;

            } else if (arr[front] < arr[last]) {

                list.add(2);

                front++;

            } else {

                list.add(0);

                front++;

                last--;

            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();


    }

    public static void main(String[] args) {
        int arr[] = { 6, 4, 34, 3, 6, 8, 86, 6, 5, 432, 21, 1 };

        // bubble(arr);

        int res[] =(funGame(arr));
        for(int element : res ){
            System.out.print(element+" ");
        }
    }
}
