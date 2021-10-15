package com.example.demo.factory;

public final class FactorySimple {

    private FactorySimple(){ }

    public static Personne of(String name, String firstName) {
        return new Personne(name, firstName);
    }
}
