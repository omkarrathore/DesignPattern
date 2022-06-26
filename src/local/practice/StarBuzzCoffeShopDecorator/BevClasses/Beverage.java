package local.practice.StarBuzzCoffeShopDecorator.BevClasses;

public abstract class Beverage {
    public enum Size {TALL,MEDIUM,SMALL};

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    Size size = Size.TALL;
    protected String description = "Unknown beverage";

    public abstract double getCost();
    public String getDescription(){
        return description;
    };
}
