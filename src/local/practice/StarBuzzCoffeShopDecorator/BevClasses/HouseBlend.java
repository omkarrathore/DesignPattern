package local.practice.StarBuzzCoffeShopDecorator.BevClasses;

public class HouseBlend extends Beverage {
    @Override
    public double getCost() {
        return 3.9;
    }
    public HouseBlend(){
        description = "House Blend";
    }
}
