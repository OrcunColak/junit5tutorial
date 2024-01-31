package junit4.rule.externalresource;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.junit.rules.ExternalResource;

@Getter
@Setter
@Slf4j
public class ExternalResourceFoo extends ExternalResource {

    int field1 = 1;

    @Override
    protected void before() throws Throwable {
        log.info("ExternalResourceFoo before");
        super.before();
    }

    @Override
    protected void after() {
        log.info("ExternalResourceFoo after");
        super.after();
    }
}
