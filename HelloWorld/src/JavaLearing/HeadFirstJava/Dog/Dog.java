package Dog;

/**
 *Created by Ericwong on 2017/3/5 0005
 */
class Dog {
    private int size;
    String name;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    public void barkVoice() {
        if (size > 60) {
            System.out.println("Wooof! Wooof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
    public void bark(int times) {
        while (times > 0) {
            barkVoice();
            times = times - 1;
        }
    }
}
class DogTestDrive{
    public static void main (String [] args) {
        //创建dog对象
        Dog dog1 = new Dog();
        dog1.name = "Bart";
        dog1.setSize(70);

        dog1.bark(1);


        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Fred";
        myDogs[0].setSize(8);
        myDogs[1].name = "Marge";
        myDogs[1].setSize(35);

        System.out.print("last dog's name is ");
        System.out.println(myDogs [2].name);

        int x = 0;
        while (x < myDogs.length) {
            System.out.println("Bark! " + myDogs[x].name);
            myDogs[x].bark(5);
            x = x + 1;
        }
    }
}

