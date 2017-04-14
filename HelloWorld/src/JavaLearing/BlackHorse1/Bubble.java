/**
 *Created by Ericwong on 2017/4/10 0010
 */
public class Bubble {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 6, 3, 8};
        bubbleSort(arr);
    }

    public static void bubbleSort(int[] arr) {
        for (int x = 0; x < arr.length - 1; x++) {
            for (int j = arr.length - 1; j > x; j--) {
                int temp;
                if (arr[j] > arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        showArray(arr);
    }

    public static void showArray(int[] arr) {
        int x = 0;
        while (x < arr.length) {
            System.out.print(arr[x]);
            x++;
        }
    }
}
