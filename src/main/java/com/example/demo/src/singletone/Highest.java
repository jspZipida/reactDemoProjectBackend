package com.example.demo.src.singletone;

public class Highest {


    private static Highest self;
    private Highest(){};

    public static Highest getInstance(){
        if(self==null){
            self = new Highest();
        }
        return self;
    }


    public void say(){
        System.out.println("I am the only one");
    }

}
