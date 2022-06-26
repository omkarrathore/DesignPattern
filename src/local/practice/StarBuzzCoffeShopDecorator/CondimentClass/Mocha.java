package local.practice.StarBuzzCoffeShopDecorator.CondimentClass;

import local.practice.StarBuzzCoffeShopDecorator.BevClasses.Beverage;

public class Mocha extends Condiment{
    @Override
    public double getCost() {
        return beverage.getCost()+20;
    }
    public Mocha(Beverage bvg){
        this.beverage=bvg;
        description="Mocha";
    }
    @Override
    public String getDescription() {
        return beverage.getDescription()+ ", "+ description;
    }
}
