package local.practice.GameCharacterStrategyPattern.Weapons;

import local.practice.GameCharacterStrategyPattern.Weapons.WeaponBehaviour;

public class Knife implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("I'm fighting with lazer sharp Knife");
    }
}
