package tasks;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Sum28Test {
    @Test
    public void sum28() {
        //Given
        int[] a = {2, 2, 2, 2};
        //When
        boolean result = Tasks.sum28(a);
        //Then
        assertTrue(result);
    }

    @Test
    public void sum28Empty() {
        //Given
        int[] a = {};
        //When
        boolean result = Tasks.sum28(a);
        //Then
        assertFalse(result);
    }

    @Test
    public void sum28NotEigth() {
        //Givem
        int[] a = {2, 4, 5, 6, 2, 1, 4, 6, 4, 8};
        //When
        boolean result = Tasks.sum28(a);
        //Then
        assertFalse(result);
    }

    @Test
    public void sum28OneDigit() {
        //Given
        int[] a = {2};
        //When
        boolean result = Tasks.sum28(a);
        //Then
        assertFalse(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sum28Null() {
        //Given
        int[] nums = null;
        //When
        Tasks.centeredAverage(nums);
    }
}
