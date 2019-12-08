package tasks;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CatDogTest {
    @Test
    public void catDog() {
        //Given
        String a = "catdog";
        //When
        boolean result = Tasks.catDog(a);
        //Then
        assertTrue(result);
    }

    @Test
    public void catDogSeveralTimes() {
        //Given
        String a = "catdogcatcatdogcatdoglaladog";
        //When
        boolean result = Tasks.catDog(a);
        //Then
        assertTrue(result);
    }

    @Test
    public void catDogEmpty() {
        //Given
        String a = "";
        //When
        boolean result = Tasks.catDog(a);
        //Then
        assertTrue(result);
    }

    @Test
    public void catDogNone() {
        //Given
        String a = "cdc";
        //When
        boolean result = Tasks.catDog(a);
        //Then
        assertTrue(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void catDogNull() {
        //Given
        String a = null;
        //When
        boolean result = Tasks.catDog(a);
    }
}
