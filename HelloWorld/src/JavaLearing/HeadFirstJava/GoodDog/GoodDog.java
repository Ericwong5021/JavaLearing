package GoodDog;

/**
 *Created by Ericwong on 2017/3/9 0009
 */
class GoodDog {

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Woof Woof");
        } else if (size > 14) {
            System.out.println("Ruff Ruff");
        } else {
            System.out.println("Yip Yip");
        }
    }
}

class GoodDogTestDrive {

    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        System.out.println("Dog one is " + one.getSize());
        System.out.println("Dog two is " + two.getSize());
        one.bark();
        two.bark();
    }
}