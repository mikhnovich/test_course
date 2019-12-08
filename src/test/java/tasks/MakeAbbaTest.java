package tasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeAbbaTest {

    @Test
    public void makeAbba() {
        //Given
        String a = "aaa";
        String b = "bbb";
        String expected = "aaabbbbbbaaa";
        //When
        String result = Tasks.makeAbba(a, b);
        //Then
        assertEquals(expected, result);
    }

    @Test
    public void makeAbbaTestNull() {
        //Given
        String a = null;
        String b = null;
        String expected = "nullnullnullnull";
        //When
        String result = Tasks.makeAbba(a, b);
        //Then
        assertEquals(expected, result);
    }

    @Test
    public void makeAbbaTestEmpty() {
        //Given
        String a = "";
        String b = "";
        String expected = "";
        //When
        String result = Tasks.makeAbba(a, b);
        //Then
        assertEquals(expected, result);
    }

    @Test
    public void makeAbbaTestEmptyA() {
        //Given
        String a = "";
        String b = "kek";
        String expected = "kekkek";
        //When
        String result = Tasks.makeAbba(a, b);
        //Then
        assertEquals(expected, result);
    }

    @Test
    public void makeAbbaTestEmptyB() {
        //Given
        String a = "kek";
        String b = "";
        String expected = "kekkek";
        //When
        String result = Tasks.makeAbba(a, b);
        //Then
        assertEquals(expected, result);
    }
}
