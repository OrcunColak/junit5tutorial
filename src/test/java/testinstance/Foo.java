package testinstance;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class Foo {

    int field1 = 1;

    public Foo() {
        log.info("Foo constructor");
    }
}
