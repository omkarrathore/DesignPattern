package local.practice.PizzaFactoryPattern;

import local.practice.PizzaFactoryPattern.Pizza.Pizza;
import local.practice.PizzaFactoryPattern.Store.*;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza nyPizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Omkar ordered a " + nyPizza.getName());
        Pizza chicagoPizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Omkar ordered a " + chicagoPizza.getName());
    }
}
