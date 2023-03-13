package com.example.demo.src.design_study.demo;

public class AObj {
    Ainterface ainterface;

        public AObj(){
            ainterface = new Ainterfaceimpl();
            System.out.println("TTT");
        }



        public void funcAA(){

            ainterface.funcA();
            ainterface.funcA();
            System.out.println("CCC");
//        System.out.println("bbb");


        }
}
