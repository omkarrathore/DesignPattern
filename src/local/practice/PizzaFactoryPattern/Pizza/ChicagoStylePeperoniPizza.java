package local.practice.PizzaFactoryPattern.Pizza;

public class ChicagoStylePeperoniPizza extends Pizza{
    public ChicagoStylePeperoniPizza(){
        name = "Chicago Style deep dish pepperoni pizza";
        dough = "Extra thick crust Dough";
        sauce = "Pepper with Tomato sauce";
        toppings.add("Pepper chesse");
    }
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
