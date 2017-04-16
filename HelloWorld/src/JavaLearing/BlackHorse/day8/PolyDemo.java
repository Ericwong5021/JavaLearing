package day8;

/**
 * Created by Ericwong on 2017/4/16 0016
 */
class MainBoard {
    void run() {
        System.out.println("Mainboard is running");
    }

    void useIO(IO a) {
        if (a != null) {
            a.run();
            a.stop();
        }
    }

}

interface IO {
    public void run();

    public void stop();
}

class SoundCard implements IO {
    public void run() {
        System.out.println("SoundCard is running");
    }

    public void stop() {
        System.out.println("SoundCard is stopped");
    }
}

class GraphicsCard implements IO {

    @Override
    public void run() {
        System.out.println("GraphicsCard is running");
    }

    @Override
    public void stop() {
        System.out.println("GraphicsCard is stopped");
    }
}

public class PolyDemo {
    public static void main(String[] args) {
        MainBoard acer = new MainBoard();
        acer.run();
        acer.useIO(new SoundCard());
        acer.useIO(new GraphicsCard());
    }
}
