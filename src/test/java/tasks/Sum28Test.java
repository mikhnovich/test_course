package tasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Sum28Test {
    @Test
    public void sum28() {
        int[] a = {2, 2, 2, 2};
        boolean expected = true;

        boolean result = Tasks.sum28(a);

        assertEquals(expected, result);
    }

    @Test
    public void sum28Empty() {
        int[] a = {};
        boolean expected = false;

        boolean result = Tasks.sum28(a);

        assertEquals(expected, result);
    }

    @Test
    public void sum28NotEigth() {
        int[] a = {2, 4, 5, 6, 2, 1, 4, 6, 4, 8};
        boolean expected = false;

        boolean result = Tasks.sum28(a);

        assertEquals(expected, result);
    }

    @Test
    public void sum28OneDigit() {
        int[] a = {2};
        boolean expected = false;

        boolean result = Tasks.sum28(a);

        assertEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sum28Null() {
        int[] nums = null;
        Tasks.centeredAverage(nums);
    }
}
