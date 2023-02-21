package com.example.demo.src.decorator.concrete;

import com.example.demo.src.decorator.abst.AbstAdding;
import com.example.demo.src.decorator.abst.IBeverage;
import com.example.demo.src.decorator.abst.AbstAdding;
import com.example.demo.src.decorator.abst.IBeverage;

public class Espresso extends AbstAdding {
    public Espresso(IBeverage base) {
        super(base);
    }

    @Override
    public int getTotalPrice() {
        return super.getTotalPrice() +getAddPrice();
    }

    static protected int espressoCount = 0;

    private static int getAddPrice(){
        espressoCount += 1;
        int addPrice = 100;

        if(espressoCount > 1){
            addPrice = 70;
        }

        return addPrice;
    }
}
