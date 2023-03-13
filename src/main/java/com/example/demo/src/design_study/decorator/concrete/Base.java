package com.example.demo.src.design_study.decorator.concrete;

import com.example.demo.src.design_study.decorator.abst.IBeverage;

public class Base implements IBeverage {

    @Override
    public int getTotalPrice() {
        return 0;
    }
}
