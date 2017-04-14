package ClassTest;

/**
 * Created by Ericwong on 2017/4/9 0009.
 */
class Person {
    {
        System.out.println("Baby is Crying~~~~~~~~~~");
    }

    private String name;
    private int age;

    Person() {
    }

    Person(String name) {
        this.name = name;
    }

    Person(int age) {
        this.age = age;
    }

    Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean compare(Person x) {
        return this.age == x.age;
    }
}

class PersonTest {
    public static void main(String[] args) {
        Person a = new Person();
        a.setAge(10);
        a.setName("Faye");
        Person b = new Person("Eric", 5);
        Person c = new Person(10);
        c.setName("Danil");
        System.out.println(a.getName() + " is as old as " + c.getName() + " ? " + '\n' + c.compare(a));
    }
}