package local.practice.PizzaFactoryPattern;

import local.practice.PizzaFactoryPattern.Pizza.Pizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;
//
//        if(type.equals("cheese")){
//            pizza = new CheesePizza();
//        } else if (type.equals("pepproni")) {
//            pizza = new  PepproniPizza();
//        }else if(type.equals("clam")){
//            pizza = new ClamPizza();
//        } else if (type.equals("veggie")) {
//            pizza = new VeggiePizza();
//        }
        return pizza;
    }
}
