package JavaLearing.HeadFirstJava.beersong;

/**
 * Created by Ericwong on 2017/3/5 0005.
 */
public class beersong {
    public static void main (String[] args) {
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {

            if (beerNum == 1) {
                word="bottle";
            }

            System.out.println(beerNum + " " + word + " of bear on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;

            if (beerNum >0 ) {
                System.out.println(beerNum + " " + word + " of beer on the wall");
            } else {
                System.out.println("No more bottles of beer on the wall");
            }//else end
        }//while end
    }//main end
}//class end