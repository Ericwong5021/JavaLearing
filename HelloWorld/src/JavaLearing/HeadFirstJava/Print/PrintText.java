package Print;

/**
 * Created by Ericwong on 2017/3/26 0026.
 */
class PrintText {
    /* public static void square(int a, int b) {
         for (int x = 0;x < a;x++) {
             for (int y = 0;y < b;y++) {
                 System.out.print('-');
             }
             System.out.println();
         }
     }
 */
    public static void main(String[] args) {
        print99();
    }

    static void print99() {
        for (int x = 1; x <= 9; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(x + " * " + y + " = " + x * y + "\t");
            }
            System.out.println();
        }
    }

}