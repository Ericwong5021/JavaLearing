package Print;

/**
 * Created by Ericwong on 2017/4/9 0009.
 */
public class ArrayTrans {
    static void toBin(int num) {
        System.out.print("Bin = ");
        trans(num,1,1);
    }

    static void toOct(int num) {
        System.out.print("Oct = ");
        trans(num,7,3);
    }

    static void toHex(int num) {
        System.out.print("Hex = ");
        trans(num,15,4);
    }

    static void trans(int num, int basc, int offset) {
        char[] any = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] arr = new char[32];
        int pos = arr.length;
        while (num != 0) {
            int temp = num & basc;
            arr[--pos] = any[temp];
            num = num >>> offset;
        }
        for (int x = pos; x < arr.length; x++) {
            System.out.print(arr[x]);
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int a = 8;
        System.out.println("Dec = " + a);
        toBin(a);
        toOct(a);
        toHex(a);
    }
}
