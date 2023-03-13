package com.example.demo.src.design_study.command2;

public class MoveCommand implements Command{
    private int x;
    private int y;

    public MoveCommand(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void run(){
        System.out.println(String.format("%c[%d;%df", 0x1B, y, x));
    }
}
