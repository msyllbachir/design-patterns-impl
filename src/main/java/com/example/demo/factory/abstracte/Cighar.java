package com.example.demo.factory.abstracte;

public class Cighar implements Khassida {

    @Override
    public String name() {
        return ConstantUtil.NAME_CIGHAR;
    }

    @Override
    public String category() {
        return ConstantUtil.CATEGORY_XAM_XAM;
    }
}
