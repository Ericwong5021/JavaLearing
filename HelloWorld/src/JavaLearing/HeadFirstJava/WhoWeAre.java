/**
 *Created by Ericwong on 2017/3/5 0005
 */
public class WhoWeAre {
    public static void main(String[] args) {
        String[] wordList1 = {"I am", "He is", "She is"};//定义数组
        String[] wordList2 = {"a baby", "an adult.", "a child."};

        int length1 = wordList1.length;//取数组的长度（位数）
        int length2 = wordList2.length;

        int rand1 = (int) (Math.random() * length1);//产生一个随机数,(int)是后面括号内数字()取整的意思
        int rand2 = (int) (Math.random() * length2);

        String phrase = wordList1[rand1] + " " + wordList2[rand2];//两组数组分别随机选定数组内一个值，带入字符串

        System.out.print("Is obvious that " + phrase);//输出结果。
    }
}
