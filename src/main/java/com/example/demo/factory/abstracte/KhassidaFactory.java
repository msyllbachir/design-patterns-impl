package com.example.demo.factory.abstracte;

public class KhassidaFactory extends KhassidaAbstractFactory{
    Khassida createKhassida(ConstantUtil.KhassidaEnum khassidaEnum) {
        switch (khassidaEnum) {
            case JAZBU: return new Jazbu();
            case CIGHAR: return new Cighar();
            default:
                throw new IllegalStateException("Unexpected value: " + khassidaEnum);
        }
    }
}
