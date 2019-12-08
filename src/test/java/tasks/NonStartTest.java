package tasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonStartTest {
    @Test
    public void nonStart() {
        //Given
        String a = "LOL";
        String b = "kek";
        String expected = "OLek";
        //When
        String result = Tasks.nonStart(a, b);
        //Then
        assertEquals(expected, result);
    }

    @Test
    public void nonStartOneCharStringA() {
        //Given
        String a = "a";
        String b = "bcd";
        String expected = "cd";
        //When
        String result = Tasks.nonStart(a, b);
        //Then
        assertEquals(expected, result);
    }

    @Test
    public void nonStartOneCharStringB() {
        //Given
        String a = "boogaga";
        String b = "k";
        String expected = "oogaga";
        //When
        String result = Tasks.nonStart(a, b);
        //Then
        assertEquals(expected, result);
    }
}
