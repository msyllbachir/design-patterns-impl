package com.example.demo.proxy;

import com.example.demo.factory.Personne;

import java.util.HashMap;
import java.util.Map;

public class ProxyPersonSeeker implements PersonSeeker{

    private final static Map<String, Personne> PERSONNE_MAP_CACHE = new HashMap<>();

    static {
        PERSONNE_MAP_CACHE.put("toto", new Personne("toto", "jean"));
    }

    private final PersonSeeker concretePersonSeeker;

    public ProxyPersonSeeker(PersonSeeker concretePersonSeeker) {
        this.concretePersonSeeker = concretePersonSeeker;
    }

    @Override
    public Personne findPerson(String name) {
        return PERSONNE_MAP_CACHE.getOrDefault(name, concretePersonSeeker.findPerson(name));
    }
}
