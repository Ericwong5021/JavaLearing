package day9.InnerClass;

/**
 * Created by Ericwong on 2017/4/16 0016
 */
class outer {

    private int num = 1;


    void show() {
        System.out.println("outer's num = "+num);
    }

    void method() {
        inner in = new inner();
        System.out.println("out method: ");
        in.innerShow();
    }

    class inner {
        int num = 2;
        void innerShow() {
            int num = 3;
            System.out.println("inner num = " + num);
            System.out.println("inner num = " + this.num);
            System.out.println("inner num = " + outer.this.num);
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        outer out = new outer();
        out.show();
//        out.method();
        outer.inner in = new outer().new inner();
        in.innerShow();
    }
}
