package Print;

/**
 * Created by Ericwong on 2017/4/9 0009.
 */
public class ConvText {
    static void toBin(int num) {
        StringBuffer bin = new StringBuffer();
        while (num > 0) {
            bin.append(num % 2);
            num = num / 2;
        }
        System.out.print(bin.reverse());
        System.out.println();
    }

    static void toHex(int num) {
        StringBuffer hex = new StringBuffer();
        for (int x = 0;x < 8;x++) {
            int temp = num & 15;
            if (temp > 9) {
                hex.append((char) (temp - 10 + 'A'));
            }
            else hex.append(temp);
            num = num >>> 4;
        }
        System.out.println(hex.reverse());
    }

    static void toBin1(int num) {
        char[] bin = {'0', '1'};
        char[] arr = new char[32];
        int pos = arr.length;
        while (num != 0) {
            int temp = (num & 1);
            arr[--pos] = bin[temp];
            num = num >>> 1;
        }
        for (int x = pos;x < arr.length;x++) {
            System.out.print(arr[x]);
        }
        System.out.println();
    }

    static void toHex1(int num) {
        char[] hex = {'0','1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] arr = new char[8];
        int pos = arr.length;
        while (num != 0) {
            int temp = num & 15;
            arr[--pos] = hex[temp];
            num = num >>> 4;
        }
        for (int x = pos;x < arr.length;x++) {
            System.out.print(arr[x]);
        }
        System.out.println();
    }



    public static void main(String[] args) {
        int a = -9;
        int b = 990;
        toBin(a);
        toBin1(a);
        toHex(b);
        toHex1(b);
    }
}
