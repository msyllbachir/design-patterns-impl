package com.example.demo.factory.abstracte;

public interface Khassida {
    default String getAuthor() {
        return ConstantUtil.AUTHOR_KH;
    }
    String name();
    String category();
}
