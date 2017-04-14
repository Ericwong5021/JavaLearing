/**
 *Created by Ericwong on 2017/3/6 0006
 */
public class TapeDeck {

    boolean canRecord = false;

    void playTape() {
        System.out.println("tape playing");
    }

    void recordTape() {
        System.out.print("tape recording");
    }
}

class TapeDeckTestDrive {
    public static void main (String [] args) {

        TapeDeck t = new TapeDeck();
        t.canRecord = true;
        t.playTape();

        if (t.canRecord) {
            t.recordTape();

        }
    }
}