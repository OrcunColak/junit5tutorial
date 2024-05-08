package assertequals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

class AssertEqualsTest {

    enum Fruit {
        APPLE, BANANA, CHERRY;
    }

    @Test
    void testSet() {
        Set<Fruit> set1 = Set.of(Fruit.APPLE, Fruit.BANANA, Fruit.CHERRY);
        Set<Fruit> set2 = Set.of(Fruit.CHERRY, Fruit.BANANA, Fruit.APPLE);

        // Equals because set orders are the same
        Assertions.assertEquals(set1, set2);
    }

    @Test
    void testList() {
        Set<Fruit> set1 = Set.of(Fruit.APPLE, Fruit.BANANA, Fruit.CHERRY);
        List<Fruit> list = List.of(Fruit.CHERRY, Fruit.BANANA, Fruit.APPLE);

        // Not equals because list order is different from set order
        Assertions.assertNotEquals(set1, list);
    }
}
