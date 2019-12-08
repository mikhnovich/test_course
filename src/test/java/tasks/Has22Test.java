package tasks;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Has22Test {
    @Test
    public void has22() {
        //Given
        int[] a = {1, 2, 2, 2, 2, 3, 4, 9};
        //When
        boolean result = Tasks.has22(a);
        //Then
        assertTrue(result);
    }

    @Test
    public void has22Empty() {
        //Given
        int[] a = {};
        //When
        boolean result = Tasks.has22(a);
        //Then
        assertFalse(result);
    }

    @Test
    public void has22Only2() {
        //Given
        int[] a = {2, 2};
        //When
        boolean result = Tasks.has22(a);
        //Then
        assertTrue(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void has22Null() {
        //Given
        int[] nums = null;
        //When
        Tasks.centeredAverage(nums);
    }
}
