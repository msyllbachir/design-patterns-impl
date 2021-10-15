package com.example.demo.decorator;

import java.util.Set;

import static com.example.demo.decorator.CellPhone.Functionality.CALL;
import static com.example.demo.decorator.CellPhone.Functionality.SMS;

public class SimplePhone implements CellPhone{
    @Override
    public Set<Functionality> getFunctionalities() {
        return Set.of(CALL, SMS);
    }

    @Override
    public double getPrice() {
        return getFunctionalities().stream().mapToDouble(Functionality::price).sum();
    }
}
