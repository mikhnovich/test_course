package tasks;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BobThereTest {
    @Test
    public void bobThere() {
        //Given
        String a = "bbb";
        //When
        boolean result = Tasks.bobThere(a);
        //Then
        assertTrue(result);
    }

    @Test
    public void bobThereNoBob() {
        //Given
        String a = "abcdegdhaoldbckspw";
        //When
        boolean result = Tasks.bobThere(a);
        //Then
        assertFalse(result);
    }

    @Test
    public void bobThereEmpty() {
        //Given
        String a = "";
        //When
        boolean result = Tasks.bobThere(a);
        //Then
        assertFalse(result);
    }

    @Test
    public void bobThereNumbers() {
        //Given
        String a = "bb12313b1b1b0b";
        //When
        boolean result = Tasks.bobThere(a);
        //Then
        assertTrue(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void bobThereNull() {
        //Given
        String a = null;
        //Then
        boolean result = Tasks.bobThere(a);
    }
}
