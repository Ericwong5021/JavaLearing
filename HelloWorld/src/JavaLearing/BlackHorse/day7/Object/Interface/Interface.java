package day7.Object.Interface;

/**
 * Created by Ericwong on 2017/4/15 0015
 */
class Human {
    private String name;
    private int age;

    Human(String name, int age) {

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

class Student extends Human {

    Student(String name, int age) {
        super(name, age);
    }

    void learn() {
        System.out.println("Learn some thing");
    }
}

interface Javaer {
    void code();
}

class Me extends Student implements Javaer {

    Me(String name, int age) {
        super(name, age);
    }

    @Override
    public void code() {
        System.out.println("code program");
    }
}

public class Interface {

    public static void main(String[] args) {
        Me eric = new Me("Ericwong",22);
        eric.code();
        eric.learn();
    }
}
