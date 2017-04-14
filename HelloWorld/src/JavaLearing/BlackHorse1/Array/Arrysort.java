package Array;

import java.util.Arrays;

/**
 * Created by Ericwong on 2017/4/8 0008.
 */
public class Arrysort {
    public static void selectSort(int[] arr) {
        for (int x = 0; x < arr.length - 1; x++) {
            for (int y = x + 1; y < arr.length; y++) {
                int temp;
                if (arr[x] > arr[y]) {
                    temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                }
            }
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int x = arr.length;x > 0;x--) {
            for (int y = 0; y < x - 1; y++) {
                int temp;
                if (arr[y] > arr[y + 1]) {
                    temp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 3, -3, 6, -9};
        print(arr);
        selectSort(arr);
        print(arr);
        bubbleSort(arr);
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr) {
        System.out.print("arr = [");
        for (int x = 0;x < arr.length;x++) {
            if (x < arr.length-1) {
                System.out.print(arr[x] + ",");
            } else {
                System.out.println(arr[x] + "]");
            }
        }
    }
}
