package local.practice.PizzaFactoryPattern.Store;

import local.practice.PizzaFactoryPattern.Pizza.ChicagoStyleCheesePizza;
import local.practice.PizzaFactoryPattern.Pizza.ChicagoStylePeperoniPizza;
import local.practice.PizzaFactoryPattern.Pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equalsIgnoreCase("cheese"))
            pizza = new ChicagoStyleCheesePizza();
        if(type.equalsIgnoreCase("peproni"))
            pizza = new ChicagoStylePeperoniPizza();
        return pizza;
    }
}
