package tasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Sum13Test {
    @Test
    public void sum13() {
        //Given
        int[] a = {13, 1, 13, 4, 5, 6, 9};
        int expected = 20;
        //When
        int result = Tasks.sum13(a);
        //Then
        assertEquals(expected, result);
    }

    @Test
    public void sum13Empty() {
        //Given
        int[] a = {};
        int expected = 0;
        //When
        int result = Tasks.sum13(a);
        //Then
        assertEquals(expected, result);
    }

    @Test
    public void sum13Double13() {
        //Given
        int[] a = {13, 1, 13};
        int expected = 0;
        //When
        int result = Tasks.sum13(a);
        //Then
        assertEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sum13Null() {
        //Given
        int[] nums = null;
        //When
        Tasks.centeredAverage(nums);
    }
}
