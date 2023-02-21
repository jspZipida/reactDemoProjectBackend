package com.example.demo;

import com.example.demo.src.decorator.abst.IBeverage;
import com.example.demo.src.decorator.concrete.Base;
import com.example.demo.src.observer.Button;
import com.example.demo.src.singletone.Highest;
import com.example.demo.src.weapon_package.Ax;
import com.example.demo.src.weapon_package.GameCharacter;
import com.example.demo.src.weapon_package.Knife;
import com.example.demo.src.weapon_package.Sword;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//        SpringApplication.run(DemoApplication.class, args);

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

    }

}
