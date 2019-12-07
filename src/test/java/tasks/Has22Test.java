package tasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Has22Test {
    @Test
    public void has22() {
        int[] a = {1, 2, 2, 2, 2, 3, 4, 9};
        boolean expected = true;

        boolean result = Tasks.has22(a);

        assertEquals(expected, result);
    }

    @Test
    public void has22Empty() {
        int[] a = {};
        boolean expected = false;

        boolean result = Tasks.has22(a);

        assertEquals(expected, result);
    }

    @Test
    public void has22Only2() {
        int[] a = {2, 2};
        boolean expected = true;

        boolean result = Tasks.has22(a);

        assertEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void has22Null() {
        int[] nums = null;
        Tasks.centeredAverage(nums);
    }
}
