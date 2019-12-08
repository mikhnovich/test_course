package tasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CenteredAverageTest {


    @Test
    public void centeredAverage() {
        //Given
        int[] a = {1, 2, 3, 4, 5};
        int expected = 3;
        //When
        int result = Tasks.centeredAverage(a);
        //Then
        assertEquals(expected, result);
    }

    @Test
    public void centeredAverageTheSame() {
        //Given
        int[] a = {9, 9, 9};
        int expected = 9;
        //When
        int result = Tasks.centeredAverage(a);
        //Then
        assertEquals(expected, result);
    }

    @Test
    public void centeredAverageSameMaxMin() {
        //Given
        int[] a = {1, 99, 1, 99};
        int expected = 50;
        //When
        int result = Tasks.centeredAverage(a);
        //Then
        assertEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void centeredAverageNull() {
        //Given
        int[] nums = null;
        //When
        Tasks.centeredAverage(nums);
    }
}