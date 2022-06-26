package local.practice.StarBuzzCoffeShopDecorator.CondimentClass;

import local.practice.StarBuzzCoffeShopDecorator.BevClasses.Beverage;

public class Whip extends Condiment{
    @Override
    public double getCost() {
        return beverage.getCost()+10;
    }
    public Whip(Beverage bvg){
        this.beverage=bvg;
        description="Whip";
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+", "+description;
    }
}
