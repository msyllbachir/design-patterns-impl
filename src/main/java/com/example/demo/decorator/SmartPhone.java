package com.example.demo.decorator;

import java.util.Set;

import static com.example.demo.decorator.CellPhone.Functionality.*;
import static com.example.demo.decorator.CellPhone.Functionality.MUSIC;

public class SmartPhone extends CellPhoneDecorator {

    private static final Set<Functionality> SMART_FUNCTIONALITIES = Set.of(MUSIC, PHOTO, VIDEO, GPS, INTERNET);
    private static final double ADDITIONAL_PRICE = 5.0;

    public SmartPhone(CellPhone cellPhone) {
        super(cellPhone);
    }

    @Override
    public Set<Functionality> getFunctionalities() {
        final Set<Functionality> functionalities = super.getFunctionalities();
        functionalities.addAll(SMART_FUNCTIONALITIES);
        return functionalities;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + SMART_FUNCTIONALITIES.stream().mapToDouble(Functionality::price).sum() + ADDITIONAL_PRICE;
    }
}
