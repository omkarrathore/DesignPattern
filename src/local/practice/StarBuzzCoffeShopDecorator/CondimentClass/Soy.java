package local.practice.StarBuzzCoffeShopDecorator.CondimentClass;

import local.practice.StarBuzzCoffeShopDecorator.BevClasses.Beverage;

public class Soy extends Condiment{
    @Override
    public double getCost() {
        return beverage.getCost() + 15;
    }
    public Soy(Beverage bvg){
        this.beverage = bvg;
        description="Soy";
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() +", " + description;
    }
}
