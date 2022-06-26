package local.practice.PizzaFactoryPattern.Pizza;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style deep dish chesse pizza";
        dough = "Extra thick crust Dough";
        sauce = "Plum Tomato sauce";
        toppings.add("Grated Reggiano Chesse");
    }
    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
