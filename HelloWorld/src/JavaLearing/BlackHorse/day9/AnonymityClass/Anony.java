package day9.AnonymityClass;

/**
 * Created by Ericwong on 2017/4/16 0016
 */
interface Inter {
    void method();
}

class Test {
    static Inter   function() {
        return new Inter() {
            public void method() {
                System.out.println("method run");
            }
        };//注意！此行还属于return语句，需使用; 结尾
    }
}

public class Anony {
    public static void main(String[] args) {
        Test.function().method();
        /*Test.function()的结果是一个可以调用method方法的对象
        所以function的返回值是Inter对象
        在return处返回一个Inter的匿名内部类
        并在类中重写method方法
   =>   Inter in = Test.function();
        in.method();
         */



        show(new Inter() {
            @Override
            public void method() {
                System.out.println("method show run");
            }
        });



        new Object() {
            void function() {
                System.out.println("function run");     //创建一个Object的匿名内部类并覆盖一个function的方法
            }                                           //可以利用匿名内部类在主函数中凭空调用function方法
        }.function();   //注意符号格式

    }

    public static void show(Inter I) {
        I.method();
    }
}
