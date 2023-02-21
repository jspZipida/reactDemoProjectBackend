package com.example.demo.src.decorator.concrete;

import com.example.demo.src.decorator.abst.AbstAdding;
import com.example.demo.src.decorator.abst.IBeverage;
import com.example.demo.src.decorator.abst.AbstAdding;
import com.example.demo.src.decorator.abst.IBeverage;

public class Milk extends AbstAdding {
    public Milk(IBeverage meterial){
        super(meterial);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice()+50;
    }

}
