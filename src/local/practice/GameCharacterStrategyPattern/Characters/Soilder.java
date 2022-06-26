package local.practice.GameCharacterStrategyPattern.Characters;

public class Soilder extends Character{
    @Override
    public void fight() {
        System.out.println("We will fight with all of our energy");
        weaponBehaviour.useWeapon();
    }

    @Override
    public void display() {
        System.out.println("We soldiers are the bottom layer of this kingdom");
    }
}
