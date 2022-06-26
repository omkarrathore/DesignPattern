package local.practice.DuckStartegyPattern;

public class MallardDuck extends Duck {
    public MallardDuck(){
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a mallard duck");
    }
}
