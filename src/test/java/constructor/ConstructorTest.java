package constructor;

import collections.DequeCollectionTest;
import constructor.implementation.ServiceInterfaceImpl;
import constructor.service.ServiceInterface;
import lombok.Setter;
import org.junit.jupiter.api.Test;

public class ConstructorTest {
    ServiceInterface service = new ServiceInterfaceImpl();

    //ConstructorTestClass constructorTestClass;

    @Test
    public void testService() {
        service.call("kfalekflae");
    }
}
