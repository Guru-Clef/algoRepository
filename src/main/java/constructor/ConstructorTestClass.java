package constructor;

import constructor.service.ServiceInterface;


public class ConstructorTestClass {

    private ServiceInterface serviceInterface;

    public ConstructorTestClass(ServiceInterface serviceInterface) {
        this.serviceInterface = serviceInterface;
    }



    public void callService(String message) {
        serviceInterface.call(message);
    }



}
