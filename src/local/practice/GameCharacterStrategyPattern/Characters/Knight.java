package local.practice.GameCharacterStrategyPattern.Characters;

public class Knight extends Character{
    @Override
    public void fight() {
        System.out.println("I will fight till my last breath");
        weaponBehaviour.useWeapon();
    }

    @Override
    public void display() {
        System.out.println("I am a dark knight");
    }
}
