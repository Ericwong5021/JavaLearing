package DrumKit;

/**
 *Created by Ericwong on 2017/3/6 0006
 */
class DrumKit {
    boolean topHat = true;
    boolean snare = true;

    void playTopHat () {
        System.out.println("ding ding da-ding");
    }
    void PlaySnare () {
        System.out.println("bang bang ba-bang");
    }
}

class DrumKitTextDriver {
    public static void main (String [] args) {
        DrumKit d = new DrumKit();
        d.snare = false;
        d.PlaySnare();
        d.playTopHat();
        if (d.snare) {
            d.PlaySnare();
        }
    }
}