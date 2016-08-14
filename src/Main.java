/**
 * Created by win808mac on 8/8/16.
 */

public class Main {

    public static void main(String[] args) {
        Kata kata = new Kata();


        //Call out to sleepIn method
        System.out.println(kata.sleepIn(false, false));
        System.out.println(kata.sleepIn(true, false));
        System.out.println(kata.sleepIn(false, true));


        //monkeyTrouble warm-up
        System.out.println(kata.monkeyTrouble(true, true));
        System.out.println(kata.monkeyTrouble(false, false));
        System.out.println(kata.monkeyTrouble(true, false));

        //doubleSum warm - up
        System.out.println(kata.doubleSum(1,2));
        System.out.println(kata.doubleSum(3,2));
        System.out.println(kata.doubleSum(2,2));

        //diff21 warm - up
        System.out.println(kata.diff21(19));
        System.out.println(kata.diff21(10));
        System.out.println(kata.diff21(21));


        //loudParrot warm-up
        System.out.println(kata.loudParrot(true, 6));
        System.out.println(kata.loudParrot(true, 7));
        System.out.println(kata.loudParrot(false, 6));

        //makes10 warm-up
        System.out.println(kata.makes10(9,10));
        System.out.println(kata.makes10(9,9));
        System.out.println(kata.makes10(9,10));

        //nearHundred warm-up
        System.out.println(kata.nearHundred(93));
        System.out.println(kata.nearHundred(90));
        System.out.println(kata.nearHundred(89));

        //posNeg warm - up
        System.out.println(kata.posNeg(1,-1,false));
        System.out.println(kata.posNeg(-1,1,false));
        System.out.println(kata.posNeg(-4,-5,true));

        //or35 warm - up
        System.out.println(kata.or35(3));
        System.out.println(kata.or35(10));
        System.out.println(kata.or35(8));

        //startHi warm - up
        System.out.println(kata.startHi("hi there"));
        System.out.println(kata.startHi("hi"));
        System.out.println(kata.startHi("hello hi"));

        //icyHot warm - up
        System.out.println(kata.icyHot(120,-1));
        System.out.println(kata.icyHot(-1,120));
        System.out.println(kata.icyHot(2,120));

        //in1020 warm - up
        System.out.println(kata.in1020(12,99));
        System.out.println(kata.in1020(21,12));
        System.out.println(kata.in1020(8,99));

        //hasTeen warm - up
        System.out.println(kata.hasTeen(13,20,10));
        System.out.println(kata.hasTeen(20,19,10));
        System.out.println(kata.hasTeen(20,10,13));

        //loneTeen warm - up
        System.out.println(kata.loneTeen(13,99));
        System.out.println(kata.loneTeen(21,19));
        System.out.println(kata.loneTeen(13,13));

        //intMax warm - up
        System.out.println(kata.intMax(1,2,3));
        System.out.println(kata.intMax(1,3,2));
        System.out.println(kata.intMax(3,2,1));

        //in3050 warm - up
        System.out.println(kata.in3050(30,31));
        System.out.println(kata.in3050(30,41));
        System.out.println(kata.in3050(40,50));

        //close10 warm up
        //close10 warm - up *SKIPPED*
        //System.out.println(kata.close10(8,13));


    }


}