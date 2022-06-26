package local.practice.DuckStartegyPattern;

public abstract class Duck{
    protected QuackBehaviour quackBehaviour;
    protected FlyBehaviour flyBehaviour;

    public Duck(){ }

    public abstract void display();

    public void performFly(){
       flyBehaviour.fly();
    }
    public void performQuack(){
        quackBehaviour.quack();
    }
    public void setFlyBehaviour(FlyBehaviour flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    };
    public void setQuackBehaviour(QuackBehaviour quackBehaviour){
        this.quackBehaviour = quackBehaviour;
    }
    public void swim(){
        System.out.println("All ducks float, even decoys");
    }
}
