package com.example.demo.src.design_study.decorator.concrete;

import com.example.demo.src.design_study.decorator.abst.AbstAdding;
import com.example.demo.src.design_study.decorator.abst.IBeverage;

public class Milk extends AbstAdding {
    public Milk(IBeverage meterial){
        super(meterial);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice()+50;
    }

}
