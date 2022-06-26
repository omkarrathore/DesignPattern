package local.practice.GameCharacterStrategyPattern.Weapons;

public class Axe implements WeaponBehaviour{
    @Override
    public void useWeapon() {
        System.out.println("I am using Axe to fight");
    }
}
