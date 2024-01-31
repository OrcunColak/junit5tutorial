package testinstance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * A new instance of Foo is created for every method
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PerMethodTest {

    private final Foo foo = new Foo();

    @Test
    @Order(1)
    void testIncrementByOne() {
        foo.setField1(foo.getField1() + 1);
        Assertions.assertEquals(2, foo.getField1());
    }

    @Test
    @Order(2)
    void testIncrementByTwo() {
        foo.setField1(foo.getField1() + 2);
        Assertions.assertEquals(3, foo.getField1());
    }
}
