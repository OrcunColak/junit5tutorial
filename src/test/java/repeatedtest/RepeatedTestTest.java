package repeatedtest;

import org.junit.jupiter.api.RepeatedTest;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertTrue;

// Sometimes a test might pass 99% of the time but fail occasionally due to race conditions or timing issues.
//
// @RepeatedTest helps identify these flaky tests by running them multiple times.
class RepeatedTestTest {

    @RepeatedTest(3)
    void myRepeatedTest() {
        int result = ThreadLocalRandom.current().nextInt(1, 10);
        assertTrue(result > 5, "Result should be greater than 0");
    }
}
