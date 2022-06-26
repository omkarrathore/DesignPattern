package local.practice.StarBuzzCoffeShopDecorator;

import local.practice.StarBuzzCoffeShopDecorator.BevClasses.Beverage;
import local.practice.StarBuzzCoffeShopDecorator.BevClasses.Espresso;
import local.practice.StarBuzzCoffeShopDecorator.CondimentClass.Mocha;
import local.practice.StarBuzzCoffeShopDecorator.CondimentClass.Whip;

public class CoffeShopMain {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " costs "+ beverage.getCost());
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + " costs "+ beverage.getCost());
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " costs "+ beverage.getCost());
    }
}
