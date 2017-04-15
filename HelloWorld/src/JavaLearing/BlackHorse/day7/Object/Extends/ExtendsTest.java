package day7.Object.Extends;

/**
 * Created by Ericwong on 2017/4/15 0015
 */
public class ExtendsTest {
    public static void main(String[] args) {
        cat c = new cat();
        dog d = new dog();
        c.eat();c.sleep();
        d.eat();d.sleep();
    }
}

abstract class Animal {
    abstract void eat();

    void sleep() {
        System.out.println(this.getClass()+ " is sleeping");
    }

}

class cat extends Animal {
    @Override
    void eat() {
        System.out.println("Eat fish");
    }
}

class dog extends Animal {
    @Override
    void eat() {
        System.out.println("Eat bone");
    }
}