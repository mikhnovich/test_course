package tasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoubleCharTest {
    @Test
    public void doubleChar() {
        String a = "hi";
        String expected = "hhii";

        String result = Tasks.doubleChar(a);

        assertEquals(expected, result);
    }

    @Test
    public void doubleCharEmpty() {
        String a = "";
        String expected = "";

        String result = Tasks.doubleChar(a);

        assertEquals(expected, result);
    }

    @Test
    public void doubleCharDots() {
        String a = "...";
        String expected = "......";

        String result = Tasks.doubleChar(a);

        assertEquals(expected, result);
    }

    @Test
    public void doubleCharOneChar() {
        String a = "o";
        String expected = "oo";

        String result = Tasks.doubleChar(a);

        assertEquals(expected, result);
    }
}
