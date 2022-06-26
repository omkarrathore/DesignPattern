package local.practice.PizzaFactoryPattern;

public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory spf){
        this.factory = spf;
    }

    public Pizza orderPizza(String type){
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.cut();
        return pizza;
    }


}
