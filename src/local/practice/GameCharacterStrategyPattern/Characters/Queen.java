package local.practice.GameCharacterStrategyPattern.Characters;

public class Queen extends Character{
    @Override
    public void fight() {
        System.out.println("I will do everything in my potential to win this war");
        weaponBehaviour.useWeapon();
    }

    @Override
    public void display() {
        System.out.println("I am a great queen");
    }
}
