package Array;

/**
 * Created by Ericwong on 2017/4/8 0008.
 */
public class HalfSearch {
    public static int halfSearch(int[] arr, int a) {
        int min = 0, max = arr.length - 1, mid;
        while (min <= max) {
            mid = (max + min) / 2;
            if (a > arr[mid]) {
                min = mid + 1;
            }else if (a < arr[mid]) {
                max = mid - 1;
            }
            else
                return mid;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 8};
        int Index = halfSearch(arr, 4);
        System.out.println(Index);
    }
}
