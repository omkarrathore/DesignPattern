package local.practice.DuckStartegyPattern;

public class FlyNoWay implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Cannot fly");
    }
}
