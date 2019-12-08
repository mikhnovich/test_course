package tasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoubleCharTest {
    @Test
    public void doubleChar() {
        //Given
        String a = "hi";
        String expected = "hhii";
        //When
        String result = Tasks.doubleChar(a);
        //Then
        assertEquals(expected, result);
    }

    @Test
    public void doubleCharEmpty() {
        //Given
        String a = "";
        String expected = "";
        //When
        String result = Tasks.doubleChar(a);
        //Then
        assertEquals(expected, result);
    }

    @Test
    public void doubleCharDots() {
        //Given
        String a = "...";
        String expected = "......";
        //when
        String result = Tasks.doubleChar(a);
        //Then
        assertEquals(expected, result);
    }

    @Test
    public void doubleCharOneChar() {
        //Given
        String a = "o";
        String expected = "oo";
        //When
        String result = Tasks.doubleChar(a);
        //Then
        assertEquals(expected, result);
    }
}
