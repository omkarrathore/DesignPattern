package local.practice.PizzaFactoryPattern.Store;

import local.practice.PizzaFactoryPattern.Pizza.Pizza;
/*
The Factory Method pattern(e.g. PizzaStore) defines an interface for creating an object,
    but lets subclasses(e.g. ChicagoPizzaStore, NYPizzaStore) decide which class to instantiate.
    Factory Method lets a class defer instantiation to subclasses.
*/

public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);

}
