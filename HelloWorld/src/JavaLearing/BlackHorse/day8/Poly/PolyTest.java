package day8.Poly;

/**
 * Created by Ericwong on 2017/4/15 0015
 */

abstract class Animal {

    abstract void eat();
}

class cat extends Animal {

    void eat() {
        System.out.println("Eat fish");
    }

    void catchMouse() {
        System.out.println("Catch a mouse");
    }

}

class dog extends Animal {

    void eat() {
        System.out.println("Eat bone");
    }

    void watchDoor() {
        System.out.println("Watch the door");
    }

}

public class PolyTest {
    public static void main(String[] args) {
        Animal c = new cat();
        c.eat();
        cat c1 = (cat) c;
        c1.catchMouse();
        Animal d = new dog();
        d.eat();
        dog d1 = (dog) d;
        d1.watchDoor();
    }
}
