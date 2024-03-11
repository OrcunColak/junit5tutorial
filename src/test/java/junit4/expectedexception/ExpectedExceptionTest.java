package junit4.expectedexception;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class ExpectedExceptionTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testNoExceptionExpected() {
        // Configure the ExpectedException rule to expect no exceptions
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("This should not happen");

        int result = 1;

        // Perform some actions that should not throw any exceptions
        result = addNumbers(2, 3);

        // The code below should not execute
        assertEquals(5, result);
    }

    private int addNumbers(int a, int b) {
        throw new RuntimeException("This should not happen");
    }

}
