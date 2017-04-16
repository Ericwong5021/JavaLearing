package day8.Object;

/**
 * Created by Ericwong on 2017/4/16 0016
 */
class Demo {
    private int num;

    Demo(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Demo) {
            Demo d = (Demo) obj;
            return this.num == d.num;
        }
        return false;
    }
}

class Other {

}

public class ObjctDemo {
    public static void main(String[] args) {
        Demo d1 = new Demo(1);
        Demo d2 = new Demo(2);
        Demo d3 = new Demo(1);
        Other o1 = new Other();
        Class c = d1.getClass();

        System.out.println(d1.equals(o1));
        System.out.println(d1.equals(d2));
        System.out.println(d1.equals(d3));
        System.out.println(d1.getClass().getSimpleName());
        System.out.println(c.getName());
        System.out.println(d1.getClass().getName());
        System.out.println(d1.toString());
        System.out.println(d1.getClass().getName() + "@" + Integer.toHexString(d1.hashCode()));
        System.out.println(c.getName() + "@" + Integer.toHexString(c.hashCode()));

    }
}
