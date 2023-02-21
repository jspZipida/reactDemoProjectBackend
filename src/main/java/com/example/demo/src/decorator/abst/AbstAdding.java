package com.example.demo.src.decorator.abst;

public class AbstAdding implements IBeverage{

    private IBeverage base;

    public AbstAdding(IBeverage base){
        super();
        this.base = base;
    }


    @Override
    public int getTotalPrice() {
        return base.getTotalPrice();
    }
}
