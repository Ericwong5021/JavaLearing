package day9.AnonymityClass;

/**
 * Created by Ericwong on 2017/4/16 0016
 */
abstract class Test1 {
    abstract void print();
}
class Outer {
    int x = 3;

    void method() {
//        int y = 1;
//        class Inner {
//            void show() {
//                System.out.println("inner x = " + x);
//                System.out.println(y);
//            }
//        }
//        new Inner().show();

        new Test1(){
            void print() {
                System.out.println("test");     //创建一个局部匿名内部类，通过改写抽象方法的方式创建匿名对象，并直接引用方法
            }
        }.print();
    }
}

public class AnonymityTest {
    public static void main(String[] args) {
        new Outer().method();
    }
}
