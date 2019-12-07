package tasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NonStartTest {
    @Test
    public void nonStart() {
        String a = "LOL";
        String b = "kek";
        String expected = "OLek";

        String result = Tasks.nonStart(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void nonStartOneCharStringA() {
        String a = "a";
        String b = "bcd";
        String expected = "cd";

        String result = Tasks.nonStart(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void nonStartOneCharStringB() {
        String a = "boogaga";
        String b = "k";
        String expected = "oogaga";

        String result = Tasks.nonStart(a, b);

        assertEquals(expected, result);
    }
}
