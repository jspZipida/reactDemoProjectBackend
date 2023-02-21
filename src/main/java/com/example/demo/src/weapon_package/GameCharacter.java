package com.example.demo.src.weapon_package;

public class GameCharacter {

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public Weapon weapon;


    public void attack(){

        if(weapon == null){
            System.out.println("attack without weapon");
        }else{
            weapon.attack();
        }
    }

}
