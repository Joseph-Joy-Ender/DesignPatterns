package factoryPattern;

public class NYStyleCheesePizza extends Pizza{

    public NYStyleCheesePizza() {
         name = "NY Style Sauce and Cheese Pizza";
         dough = "Thin Crust Dough";
         sauce = "Marinara Sauce";
        toppings.add("Mozzarella");
        toppings.add("Grated Reggiano Cheese");
    }
}
