package local.practice.StarBuzzCoffeShopDecorator.CondimentClass;

import local.practice.StarBuzzCoffeShopDecorator.BevClasses.Beverage;

public class SteamedMilk extends Condiment{
    @Override
    public double getCost() {
        return beverage.getCost() + 10;
    }
    public SteamedMilk(Beverage bvg){
        this.beverage = bvg;
        description = "Steamed Milk";
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+ ", " + this.description;

    }

}
