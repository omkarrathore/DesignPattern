package local.practice.StarBuzzCoffeShopDecorator.CondimentClass;

import local.practice.StarBuzzCoffeShopDecorator.BevClasses.Beverage;

public abstract class Condiment extends Beverage {
    protected Beverage beverage;
    public abstract String getDescription();
}
