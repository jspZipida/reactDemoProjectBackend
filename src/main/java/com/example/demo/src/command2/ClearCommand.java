package com.example.demo.src.command2;

import com.example.demo.src.command2.Command;

public class ClearCommand implements Command {

    @Override
    public void run() {
        System.out.println("aaaaaaaaaaa");
        System.out.flush();
    }

}
