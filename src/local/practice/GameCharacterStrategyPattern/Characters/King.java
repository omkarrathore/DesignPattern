package local.practice.GameCharacterStrategyPattern.Characters;

import local.practice.GameCharacterStrategyPattern.Characters.Character;

public class King extends Character {
    @Override
    public void fight() {
        System.out.println("I will protect my kingdom at any cost");
        weaponBehaviour.useWeapon();
    }

    @Override
    public void display() {
        System.out.println("I am mighty King");
    }
}
