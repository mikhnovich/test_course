package tasks;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TasksTest {

    @Test
    public void makeAbba() {

        String a = "aaa";
        String b = "bbb";
        String expected = "aaabbbbbbaaa";

        String result = Tasks.makeAbba(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void makeAbbaTestNull() {

        String a = null;
        String b = null;
        String expected = "nullnullnullnull";

        String result = Tasks.makeAbba(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void makeAbbaTestEmpty() {

        String a = "";
        String b = "";
        String expected = "";

        String result = Tasks.makeAbba(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void makeAbbaTestEmptyA() {

        String a = "";
        String b = "kek";
        String expected = "kekkek";

        String result = Tasks.makeAbba(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void makeAbbaTestEmptyB() {

        String a = "kek";
        String b = "";
        String expected = "kekkek";

        String result = Tasks.makeAbba(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void bobThere(){
        String a = "bbb";
        boolean expected = true;

        boolean result = Tasks.bobThere(a);

        assertEquals(expected,result);
    }

    @Test
    public void bobThereNoBob(){
        String a = "abcdegdhaoldbckspw";
        boolean expected = false;

        boolean result = Tasks.bobThere(a);

        assertEquals(expected,result);
    }

    @Test
    public void bobThereEmpty(){
        String a = "";
        boolean expected = false;

        boolean result = Tasks.bobThere(a);

        assertEquals(expected,result);
    }

    @Test
    public void bobThereNumbers(){
        String a = "bb12313b1b1b0b";
        boolean expected = true;

        boolean result = Tasks.bobThere(a);

        assertEquals(expected,result);
    }

    @Test
    public void catDog(){
        String a = "catdog";
        boolean expected = true;

        boolean result = Tasks.catDog(a);

        assertEquals(expected, result);
    }

    @Test
    public void catDogSeveralTimes(){
        String a = "catdogcatcatdogcatdoglaladog";
        boolean expected = true;

        boolean result = Tasks.catDog(a);

        assertEquals(expected, result);
    }

    @Test
    public void catDogEmpty(){
        String a = "";
        boolean expected = true;

        boolean result = Tasks.catDog(a);

        assertEquals(expected, result);
    }

    @Test
    public void catDogNone(){
        String a = "cdc";
        boolean expected = true;

        boolean result = Tasks.catDog(a);

        assertEquals(expected, result);
    }

    @Test
    public void doubleChar(){
        String a = "hi";
        String expected = "hhii";

        String result = Tasks.doubleChar(a);

        assertEquals(expected, result);
    }

    @Test
    public void doubleCharEmpty(){
        String a = "";
        String expected = "";

        String result = Tasks.doubleChar(a);

        assertEquals(expected, result);
    }

    @Test
    public void doubleCharDots(){
        String a = "...";
        String expected = "......";

        String result = Tasks.doubleChar(a);

        assertEquals(expected, result);
    }

    @Test
    public void doubleCharOneChar(){
        String a = "o";
        String expected = "oo";

        String result = Tasks.doubleChar(a);

        assertEquals(expected, result);
    }

    @Test
    public void nonStart(){
        String a ="LOL";
        String b = "kek";
        String expected = "OLek";

        String result = Tasks.nonStart(a,b);

        assertEquals(expected, result);
    }

    @Test
    public void nonStartOneCharStringA(){
        String a ="a";
        String b = "bcd";
        String expected = "cd";

        String result = Tasks.nonStart(a,b);

        assertEquals(expected, result);
    }

    @Test
    public void nonStartOneCharStringB(){
        String a ="boogaga";
        String b = "k";
        String expected = "oogaga";

        String result = Tasks.nonStart(a,b);

        assertEquals(expected, result);
    }

    @Test
    public void sum28(){
        int [] a = {2,2,2,2};
        boolean expected = true;

        boolean result = Tasks.sum28(a);

        assertEquals(expected, result);
    }

    @Test
    public void sum28Empty(){
        int [] a = {};
        boolean expected = false;

        boolean result = Tasks.sum28(a);

        assertEquals(expected, result);
    }

    @Test
    public void sum28NotEigth(){
        int [] a = {2,4,5,6,2,1,4,6,4,8};
        boolean expected = false;

        boolean result = Tasks.sum28(a);

        assertEquals(expected, result);
    }

    @Test
    public void sum28OneDigit(){
        int [] a = {2};
        boolean expected = false;

        boolean result = Tasks.sum28(a);

        assertEquals(expected, result);
    }

    @Test
    public void sum13(){
        int [] a = {13,1,13,4,5,6,9};
        int expected = 20;

        int result = Tasks.sum13(a);

        assertEquals(expected,result);
    }

    @Test
    public void sum13Empty(){
        int [] a = {};
        int expected = 0;

        int result = Tasks.sum13(a);

        assertEquals(expected,result);
    }

    @Test
    public void sum13Double13(){
        int [] a = {13,1,13};
        int expected = 0;

        int result = Tasks.sum13(a);

        assertEquals(expected,result);
    }

    @Test
    public void has22(){
        int [] a = {1,2,2,2,2,3,4,9};
        boolean expected = true;

        boolean result = Tasks.has22(a);

        assertEquals(expected,result);
    }

    @Test
    public void has22Empty(){
        int [] a = {};
        boolean expected = false;

        boolean result = Tasks.has22(a);

        assertEquals(expected,result);
    }

    @Test
    public void has22Only2(){
        int [] a = {2,2};
        boolean expected = true;

        boolean result = Tasks.has22(a);

        assertEquals(expected,result);
    }

    @Test
    public void fizzArray(){
        int n = 3;
        int [] expected = {0,1,2};

        int [] result = Tasks.fizzArray(n);

        assertArrayEquals(expected, result);
    }

    @Test
    public void fizzArrayEmpty(){
        int n = 0;
        int [] expected = {};

        int [] result = Tasks.fizzArray(n);

        assertArrayEquals(expected, result);
    }

    @Test
    public void fizzArrayZeroValue(){
        int n = 0;
        int [] expected = {};

        int [] result = Tasks.fizzArray(n);

        assertArrayEquals(expected, result);
    }

    @Test
    public void fizzArrayOneValue(){
        int n = 1;
        int [] expected = {0};

        int [] result = Tasks.fizzArray(n);

        assertArrayEquals(expected, result);
    }

    @Test
    public void centeredAverage(){
        int [] a = {1,2,3,4,5};
        int expected = 3;

        int result = Tasks.centeredAverage(a);

        assertEquals(expected,result);
    }

    @Test
    public void centeredAverageTheSame(){
        int [] a = {9,9,9};
        int expected = 9;

        int result = Tasks.centeredAverage(a);

        assertEquals(expected,result);
    }

    @Test
    public void centeredAverageSameMaxMin(){
        int [] a = {1,99,1,99};
        int expected = 50;

        int result = Tasks.centeredAverage(a);

        assertEquals(expected,result);
    }
}