package parallel;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
class ParallelTest {

    @Test
    void test_1() {
        sleep("Started test_1", 3000);
    }

    @Test
    void test_2() {
        sleep("Started test_2", 2000);
    }

    @Test
    void test_3() {
        sleep("Started test_3", 3000);
    }

    @SneakyThrows
    private void sleep(String test, int millis) {
        System.out.println("Started " + test + " ,Thread: " + Thread.currentThread().getName());
        Thread.sleep(millis);
        System.out.println("Finished " + test + " ,Thread: " + Thread.currentThread().getName());
    }
}
