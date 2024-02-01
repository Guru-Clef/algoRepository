package constructor.implementation;

import constructor.service.ServiceInterface;

public class ServiceInterfaceImpl implements ServiceInterface {


    @Override
    public String call(String message) {
        return message;
    }
}
