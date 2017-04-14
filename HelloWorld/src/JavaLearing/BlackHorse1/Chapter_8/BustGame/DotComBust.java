package Chapter_8.BustGame;
import java.util.ArrayList;

/**
 * Created by Ericwong on 2017/3/12 0012.
 */
public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuess = 0;

    private void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Baidu.com");
        DotCom two = new DotCom();
        two.setName("Taobao.com");
        DotCom three = new DotCom();
        three.setName("Tencent.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("你需要击沉三个网站");
        System.out.println("BAT");

        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String uesrGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(uesrGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuess++;
        String result = "miss";

        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.ckeckYourself(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("All done!!");
        if (numOfGuess <= 18) {
            System.out.println("You took " + numOfGuess + " guesses, Cool!!");
        } else {
            System.out.println("It took you " + numOfGuess + " times? Are u kidding??");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}


