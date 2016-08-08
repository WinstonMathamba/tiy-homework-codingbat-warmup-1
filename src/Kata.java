/**
 * Created by win808mac on 8/8/16.
 */

public class Kata {

    /* Given 2 int values,
    //return true if one is negative and one is positive.
    //Except if the parameter "negative" is true, then return true only if both are negative.
     */

    /* Given an int n, return true if it is within 10 of 100 or 200.
    //Note: Math.abs(num) computes the absolute value of a number. */
    public boolean nextHundred(int n) {
        //int num = Math.abs(n);

        if((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10)) {
            return true;
        }
        else {
            return false;
        }

    }

    /* Given 2 ints, a and b,
    //return true if one if them is 10 or if their sum is 10.*/
    public boolean makes10(int a, int b) {

        if((a + b == 10) || (a == 10) || (b == 10)) {
            return true;
        }
        else {
            return false;
        }
    }


    /* We have a loud talking parrot.
    //The "hour" parameter is the current hour time in
    //the range 0..23. We are in trouble if the parrot is
    //talking and the hour is before 7 or after 20.
    //Return true if we are in trouble. */
    public boolean loudParrot(boolean t, int h) {

        if((t == true) && (h < 7)) {
            return true;
        }
        else if((t == true) && (h > 23)) {
            return true;
        }
        else {
            return false;
        }

    }
    /* diff21 *use math.abs* Given an int n,
    //return the absolute difference between n and 21,
    //except return double the absolute difference if n is over 21.
    math.ab*/
    public int diff21(int n) {
        int adiff = Math.abs(n - 21);

        if(adiff > 21) {
            return (adiff * 2);
        }

        else {
            return adiff;
        }
    }
    /* doubleSum - Given two int values, return their sum.
    //Unless the two values are the same, then return double their sum.
     */
    public int doubleSum(int a, int b) {
        int sum = (a + b);

        if(a == b) {
            return (sum * 2);
        }
        else {
            return sum;

        }

    }

    /* monkeyTrouble - We have two monkeys, a and b, and
    //the parameters aSmile and bSmile indicate if each is smiling.
    //We are in trouble if they are both smiling or if neither of them is smiling.
    //Return true if we are in trouble. */

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return ((aSmile && bSmile) || (!aSmile && !bSmile));

    }

    public boolean sleepIn(boolean weekday, boolean vacation) {

        return (!weekday || vacation);

    }


    //exercise 1 for Kata
    public String describeDay(int day) {


        if ((day <= 6) && (day >= 2) ) {
            return "Today is a Weekday";
        }

        else if ((day == 7) || (day == 1) ) {
            return "It's the weekend!";
        }

        else {
            return "It is the second Tuesday of next week..";
        }

    }

}