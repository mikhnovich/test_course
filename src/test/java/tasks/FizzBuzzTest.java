package tasks;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FizzBuzzTest {
    @Test
    public void fizzArray() {
        int n = 3;
        int[] expected = {0, 1, 2};

        int[] result = Tasks.fizzArray(n);

        assertArrayEquals(expected, result);
    }

    @Test
    public void fizzArrayEmpty() {
        int n = 0;
        int[] expected = {};

        int[] result = Tasks.fizzArray(n);

        assertArrayEquals(expected, result);
    }

    @Test
    public void fizzArrayZeroValue() {
        int n = 0;
        int[] expected = {};

        int[] result = Tasks.fizzArray(n);

        assertArrayEquals(expected, result);
    }

    @Test
    public void fizzArrayOneValue() {
        int n = 1;
        int[] expected = {0};

        int[] result = Tasks.fizzArray(n);

        assertArrayEquals(expected, result);
    }
}
