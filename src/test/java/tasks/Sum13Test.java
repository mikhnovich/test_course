package tasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Sum13Test {
    @Test
    public void sum13() {
        int[] a = {13, 1, 13, 4, 5, 6, 9};
        int expected = 20;

        int result = Tasks.sum13(a);

        assertEquals(expected, result);
    }

    @Test
    public void sum13Empty() {
        int[] a = {};
        int expected = 0;

        int result = Tasks.sum13(a);

        assertEquals(expected, result);
    }

    @Test
    public void sum13Double13() {
        int[] a = {13, 1, 13};
        int expected = 0;

        int result = Tasks.sum13(a);

        assertEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sum13Null() {
        int[] nums = null;
        Tasks.centeredAverage(nums);
    }
}
