/**
 *Created by Ericwong on 2017/3/5 0005
 */
public class shuffle1 {
    public static void main(String[] args) {
        int x = 3;//设x为3
        byte y = 1;
        while (x > 0) {//当x大于0时执行循环,执行;满足,执行;不满足,结束循环.

            if (x > 2) {
                System.out.print("a");//x<2输出a;不满足,跳过
            }

            System.out.print("-"); //输出 - ;再次输出 -
            x = x - 1;  //使 x-1=2

            if (x == 2) {
                System.out.print("b c");//满足条件,输出b c;不满足,跳过
            }

            if (x == 1) {
                System.out.print("d");//第一次不满足条件,跳过;满足条件,输出d.
                x = x - 1;
            }
        }
    }
}
