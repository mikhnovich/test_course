package tasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CenteredAverageTest {


    @Test
    public void centeredAverage() {
        int[] a = {1, 2, 3, 4, 5};
        int expected = 3;

        int result = Tasks.centeredAverage(a);

        assertEquals(expected, result);
    }

    @Test
    public void centeredAverageTheSame() {
        int[] a = {9, 9, 9};
        int expected = 9;

        int result = Tasks.centeredAverage(a);

        assertEquals(expected, result);
    }

    @Test
    public void centeredAverageSameMaxMin() {
        int[] a = {1, 99, 1, 99};
        int expected = 50;

        int result = Tasks.centeredAverage(a);

        assertEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void centeredAverageNull() {
        int[] nums = null;
        Tasks.centeredAverage(nums);
    }
}