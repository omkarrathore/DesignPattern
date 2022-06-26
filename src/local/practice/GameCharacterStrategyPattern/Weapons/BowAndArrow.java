package local.practice.GameCharacterStrategyPattern.Weapons;

public class BowAndArrow implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("I am fighting with bow and arrow");
    }
}
