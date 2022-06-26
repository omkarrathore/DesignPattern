package local.practice.GameCharacterStrategyPattern;


import local.practice.GameCharacterStrategyPattern.Characters.*;
import local.practice.GameCharacterStrategyPattern.Characters.Character;
import local.practice.GameCharacterStrategyPattern.Weapons.Axe;
import local.practice.GameCharacterStrategyPattern.Weapons.BowAndArrow;
import local.practice.GameCharacterStrategyPattern.Weapons.Knife;
import local.practice.GameCharacterStrategyPattern.Weapons.Sword;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is from GameCharacter");
        Character character = new King();
        character.setWeaponBehaviour(new Sword());
        showProps(character);
        //----------------------
        character = new Queen();
        character.setWeaponBehaviour(new Knife());
        showProps(character);
        //----------------------
        character = new Soilder();
        character.setWeaponBehaviour(new Axe());
        showProps(character);
        //----------------------
        character = new Knight();
        character.setWeaponBehaviour(new BowAndArrow());
        showProps(character);
    }
    public static void showProps(Character c){
        System.out.println("---------------------");
        c.display();
        c.fight();
    }
}

/*
Abstract GameCharacter --Has A--> WeaponBehaviour class
void fire();
name
power
WeaponBehaviour typeOfWeapon;

Inerface Weapon-->shoot()

GameCharacter-HAS-A->WeaponBehaviour
[Gun,Pistol,Bauzka,Rifle] --> Implements --> WepaonBehaviour
[Sam,Tom,Hary,Dick] --> extends --> GameCharacter
 */
