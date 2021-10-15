package com.example.demo.decorator;

import java.util.Set;

public abstract class CellPhoneDecorator implements CellPhone {

    private final CellPhone cellPhone;

    protected CellPhoneDecorator(CellPhone cellPhone) {
        this.cellPhone = cellPhone;
    }

    @Override
    public Set<Functionality> getFunctionalities() {
        return cellPhone.getFunctionalities();
    }

    @Override
    public double getPrice() {
        return cellPhone.getPrice();
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "Functionalities=" + getFunctionalities() +
                "Price=" + getPrice() +
                '}';
    }
}
