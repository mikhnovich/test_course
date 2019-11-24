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
}