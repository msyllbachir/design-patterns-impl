package com.example.demo.singleton;


import java.util.Objects;

public final class MySingleton {

    private static Object instance;

    private MySingleton() throws IllegalAccessException {
        throw new IllegalAccessException("not authorized !");
    }

    public static synchronized Object getInstance() {
        if (Objects.isNull(instance)) {
            instance = "instance value";
        }
        return instance;
    }

 }
