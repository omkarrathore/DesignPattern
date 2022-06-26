package local.practice.StarBuzzCoffeShopDecorator.BevClasses;

public class Espresso extends Beverage{
    @Override
    public double getCost() {
        return 199;
    }
    public Espresso(){
        this.description="Espresso";
    }
}
