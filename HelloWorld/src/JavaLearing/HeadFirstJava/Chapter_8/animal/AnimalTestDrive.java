package Chapter_8.animal;

/**
 * Created by Ericwong on 2017/3/24 0024.
 */
public class AnimalTestDrive {
    public static void main(String [] args) {
        AnimalList list = new AnimalList();
        Dog a = new Dog();
        Cat c = new Cat();
        list.add(a);
        list.add(c);
        System.out.println(a.toString());
    }
}