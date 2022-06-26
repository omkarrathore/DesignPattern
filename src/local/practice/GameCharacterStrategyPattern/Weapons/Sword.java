package local.practice.GameCharacterStrategyPattern.Weapons;

import local.practice.GameCharacterStrategyPattern.Weapons.WeaponBehaviour;

public class Sword implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("I am fighting with shard sword");
    }
}
