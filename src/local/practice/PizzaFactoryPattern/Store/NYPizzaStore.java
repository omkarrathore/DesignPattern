package local.practice.PizzaFactoryPattern.Store;

import local.practice.PizzaFactoryPattern.Pizza.*;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equalsIgnoreCase("cheese"))
            pizza = new NYStyleCheesePizza();
        if(type.equalsIgnoreCase("peproni"))
            pizza = new NYSStylePepperoniPizza();
        return pizza;
    }
}
