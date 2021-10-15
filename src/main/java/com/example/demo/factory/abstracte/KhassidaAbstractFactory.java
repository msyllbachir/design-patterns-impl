package com.example.demo.factory.abstracte;

import com.example.demo.factory.abstracte.ConstantUtil.KhassidaEnum;

public abstract class KhassidaAbstractFactory {
    public abstract Khassida createKhassida(KhassidaEnum khassidaEnum);
}
