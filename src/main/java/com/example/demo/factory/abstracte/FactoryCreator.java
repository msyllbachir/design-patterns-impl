package com.example.demo.factory.abstracte;

public final class FactoryCreator {
    private FactoryCreator(){}

    public static KhassidaAbstractFactory createFactory() {
        return new KhassidaFactory();
    }

}
