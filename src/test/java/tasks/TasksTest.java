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

}