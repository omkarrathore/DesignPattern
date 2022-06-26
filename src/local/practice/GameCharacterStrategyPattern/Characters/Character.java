package local.practice.GameCharacterStrategyPattern.Characters;

import local.practice.GameCharacterStrategyPattern.Weapons.WeaponBehaviour;

public abstract class Character {
    protected WeaponBehaviour weaponBehaviour;
    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour){
        this.weaponBehaviour = weaponBehaviour;
    }
    public abstract void fight();

    public abstract void display();
}
