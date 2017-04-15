package Chapter_8.animal;

/**
 * Created by Ericwong on 2017/3/24 0024.
 */
public class AnimalList {
    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;

    public void add(Animal a) {
        if (nextIndex < animals.length) {
            animals[nextIndex] = a;
            System.out.println("Animal added at " + nextIndex);
            nextIndex++;
        }
    }
}

class Animal{
    public void eat() {

    }
}



class Cat extends Animal{

}
