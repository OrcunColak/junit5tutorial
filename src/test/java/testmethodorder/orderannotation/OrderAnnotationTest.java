package testmethodorder.orderannotation;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Slf4j
class OrderAnnotationTest {

    @Test
    @Order(1)
    void test1() {
        log.info("test 1");
    }

    @Test
    @Order(2)
    void test2() {
        log.info("test 2");
    }

}
