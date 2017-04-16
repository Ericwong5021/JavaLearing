package day9.StaticInnerClass;

/**
 * Created by Ericwong on 2017/4/16 0016
 */
class Outer {
    static int x = 1;

    int y = 2;

    static class inner {
        static void show1() {
            System.out.println("inner static show:"+x);
        }
        void show() {
            System.out.println("inner show:"+x);
        }
    }

    class inner2 {
        void show() {
            System.out.println("inner show:" + y);
        }
    }

}
public class StaticInnerClass {
    public static void main(String[] args) {
        Outer.inner.show1();
        new Outer.inner().show();
        Outer.inner2 in = new Outer().new inner2();
        in.show();
    }
}
