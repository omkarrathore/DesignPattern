package local.practice.StarBuzzCoffeShopDecorator.BevClasses;

public class DarkRoast extends Beverage {
    @Override
    public double getCost() {
        return 99;
    }
    public DarkRoast(){
        description = "Dark Roast";
    }
}
