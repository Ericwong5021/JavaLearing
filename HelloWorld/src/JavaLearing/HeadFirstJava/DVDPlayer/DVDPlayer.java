package DVDPlayer;

/**
 *Created by Ericwong on 2017/3/6 0006
 */
class DVDPlayer {

    boolean canRecord = false;

    void recordDVD() {
        System.out.println("DVD recording");
    }
    void playDVD() {
        System.out.println("DVD playing");
    }
}

class DVDPlayerTestDriver {
    public static void main (String [] rags) {
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        d.playDVD();

        if (d.canRecord == true) {
            d.recordDVD();
        }
    }
}