package junit4.rule.externalresource;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

/**
 * A new instance of ExternalResourceFoo is created for every method
 * ExternalResourceFoo is initialized and closed after each test
 */
public class ExternalResourceTest {

    @Rule
    public ExternalResourceFoo externalResourceFoo = new ExternalResourceFoo();

    @Test
    public void testIncrementByOne() {
        externalResourceFoo.setField1(externalResourceFoo.getField1() + 1);
        Assert.assertEquals(2, externalResourceFoo.getField1());
    }

    @Test
    public void testIncrementByTwo() {
        externalResourceFoo.setField1(externalResourceFoo.getField1() + 2);
        Assertions.assertEquals(3, externalResourceFoo.getField1());
    }
}
