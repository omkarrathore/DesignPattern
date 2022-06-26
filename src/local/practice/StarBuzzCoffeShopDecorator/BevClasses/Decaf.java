package local.practice.StarBuzzCoffeShopDecorator.BevClasses;

public class Decaf extends Beverage {
    @Override
    public double getCost() {
        return 105;
    }
    public Decaf(){
        description="Decaf";
    }
}
