package com.example.demo;

import com.example.demo.src.design_study.command.Command;
import com.example.demo.src.design_study.command.StringPrintCommand;
import com.example.demo.src.design_study.command2.*;
import com.example.demo.src.design_study.decorator.abst.IBeverage;
import com.example.demo.src.design_study.decorator.concrete.Base;
import com.example.demo.src.design_study.observer.Button;
import com.example.demo.src.design_study.singletone.Highest;
import com.example.demo.src.design_study.weapon_package.Ax;
import com.example.demo.src.design_study.weapon_package.GameCharacter;
import com.example.demo.src.design_study.weapon_package.Knife;
import com.example.demo.src.design_study.weapon_package.Sword;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

//        designPatternStudy();
//        commandPattern();


    }

    public static void designPatternStudy(){
        System.out.println("=========start=========");

        System.out.println("-------------스트래티지-------------");
        GameCharacter gameCharacter = new GameCharacter();
        Knife knife = new Knife();
        Sword sword = new Sword();
        Ax ax = new Ax();

        gameCharacter.attack();

        gameCharacter.setWeapon(knife);
        gameCharacter.attack();

        gameCharacter.setWeapon(sword);
        gameCharacter.attack();

        gameCharacter.setWeapon(ax);
        gameCharacter.attack();

        System.out.println("-------------스트래티지-------------");
        System.out.println("");
        System.out.println("-------------옵저버-------------");

        Button button = new Button();
        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(Button button) {
                System.out.println(button + "is Clicked");
            }
        });
        button.onClick();


        System.out.println("-------------옵저버-------------");
        System.out.println("");
        System.out.println("-------------데코레이터-------------");

        Scanner sc = new Scanner(System.in);

        IBeverage beverage = new Base();
        boolean done = false;

//        while(!done){
//            System.out.println("음료 현재 가격 : "+ beverage.getTotalPrice());
//            System.out.println("선택 : 1:샷 추가 / 2:우유 추가");
//            switch (sc.nextInt()){
//                case 0: done = true;
//                    break;
//                case 1:
//                    beverage = new Espresso(beverage);
//                    break;
//                case 2:
//                    beverage = new Milk(beverage);
//                    break;
//            }
//
//        }

        System.out.println("-------------데코레이터-------------");
        System.out.println("");
        System.out.println("-------------싱글턴-------------");

        Highest highest = Highest.getInstance();

        highest.say();

        System.out.println("-------------싱글턴-------------");
        System.out.println("");
        System.out.println("-------------커맨드-------------");

        List<Command> list = new LinkedList<>();

        /*list.add(new Command() {
            @Override
            public void excute() {
                System.out.println("작업 1");
            }
        });

        list.add(new Command() {
            @Override
            public void excute() {
                System.out.println("작업 2");
            }
        });

        list.add(new Command() {
            @Override
            public void excute() {
                System.out.println("작업 3");
            }
        });

        for (Command command : list
             ) {
            command.excute();
        }*/

        PriorityQueue<Command> q = new PriorityQueue<>();

        q.add(new StringPrintCommand("A"));
        q.add(new StringPrintCommand("AB"));
        q.add(new StringPrintCommand("ABC"));
        q.add(new StringPrintCommand("ABCD"));

        for(Command command : q){
            command.excute();
        }


        System.out.println("-------------커맨드-------------");
    }

    public static void commandPattern(){

        PriorityQueue<Command> queue = new PriorityQueue<>();

        queue.add(new StringPrintCommand("A"));
        queue.add(new StringPrintCommand("AB"));
        queue.add(new StringPrintCommand("ABC"));
        queue.add(new StringPrintCommand("ABCD"));

        for(Command command : queue){
            command.excute();
        }
    }

}
