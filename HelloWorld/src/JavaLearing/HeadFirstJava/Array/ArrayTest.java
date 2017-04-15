package Array;

/**
 *Created by Ericwong on 2017/4/8 0008
 */
public class ArrayTest {
    public static void main(String[] args) {
        double[] arr = {-1,9,-4,-2};
        double max = getMAx(arr);
        double min = getMin(arr);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }

    public static int getMAx(int[] arr) {
        int max = 0;
        for (int x = 0;x < arr.length;x++) {
            if (arr[x] > arr[max]) {
                max = x;
            }
        }
        return arr[max];
    }
    private static double getMAx(double[] arr) {
        int max = 0;
        for (int x = 0;x < arr.length;x++) {
            if (arr[x] > arr[max]) {
                max = x;
            }
        }
        return arr[max];
    }

    public static int getMin(int[] arr) {
        int min = 0;
        for (int x = 0;x < arr.length;x++) {
            if (arr[x] < arr[min]) {
                min = x;
            }
        }
        return arr[min];
    }
    private static double getMin(double[] arr) {
        int min = 0;
        for (int x = 0;x < arr.length;x++) {
            if (arr[x] < arr[min]) {
                min = x;
            }
        }
        return arr[min];
    }
}
