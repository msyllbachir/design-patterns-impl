package com.example.demo.factory.abstracte;

public class Jazbu implements Khassida {

    @Override
    public String name() {
        return ConstantUtil.NAME_JAZBU;
    }

    @Override
    public String category() {
        return ConstantUtil.CATEGORY_LOUANGE;
    }
}
