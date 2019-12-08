package tasks;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FizzBuzzTest {
    @Test
    public void fizzArray() {
        //Given
        int n = 3;
        int[] expected = {0, 1, 2};
        //When
        int[] result = Tasks.fizzArray(n);
        //Then
        assertArrayEquals(expected, result);
    }

    @Test
    public void fizzArrayEmpty() {
        //Given
        int n = 0;
        int[] expected = {};
        //When
        int[] result = Tasks.fizzArray(n);
        //Then
        assertArrayEquals(expected, result);
    }

    @Test
    public void fizzArrayZeroValue() {
        //Given
        int n = 0;
        int[] expected = {};
        //When
        int[] result = Tasks.fizzArray(n);
        //Then
        assertArrayEquals(expected, result);
    }

    @Test
    public void fizzArrayOneValue() {
        //Given
        int n = 1;
        int[] expected = {0};
        //When
        int[] result = Tasks.fizzArray(n);
        //Then
        assertArrayEquals(expected, result);
    }
}
