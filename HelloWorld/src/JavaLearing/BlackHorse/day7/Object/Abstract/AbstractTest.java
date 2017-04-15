package day7.Object.Abstract;

/**
 * Created by Ericwong on 2017/4/15 0015
 */
abstract class Employee {
    private String name;
    private int age;
    private double pay;
    public static final int OLD = 100;

    Employee(String name, int age, double pay) {
        this.name = name;
        this.age = age;
        this.pay = pay;
    }

    String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getPay() {
        return pay;
    }

    public abstract void work();
}

class Pro extends Employee {
    private int bounce;

    Pro(String name, int age, double pay, int bounce) {
        super(name, age, pay);
        this.bounce = bounce;
    }

    public int getBounce() {
        return bounce;
    }

    public void work() {
        System.out.println("Pro's work");
    }
}

class Manager extends Employee {
    private String power;

    Manager(String name, int age, double pay, String power) {
        super(name, age, pay);
        this.power = power;
    }

    public void work() {
        System.out.print("Manager's work");
    }

}

public class AbstractTest {
    public static void main(String[] args) {
        Pro xiaoming = new Pro("wong", 22, 3500, 1000);
        Manager yidong = new Manager("wong", 22, 20000, "manage");
        System.out.println(yidong.getClass()+" "+yidong.getName());
        yidong.work();
    }
}