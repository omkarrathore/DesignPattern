package local.practice.DuckStartegyPattern;

public class Main {

    public static void main(String[] args) {
	Duck duck = new MallardDuck();
        showDuckProps(duck);
    duck = new ModelDuck();
    duck.setFlyBehaviour(new RocketPoweredFly());
    duck.setQuackBehaviour(new Silence());
        System.out.println("-------------------------");
        showDuckProps(duck);
    }
    public static void showDuckProps(Duck duck){
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.swim();
    }
}
