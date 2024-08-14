package factoryPattern;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
         name = "Chicago Style Deep Dish Veggie Pizza";
         dough = "Poolish Pizza Dough";
         sauce = "Pesto Sauce";
        toppings.add("Bell Pepper");
        toppings.add("Red Onion");
        toppings.add("Shredded Mozzarella Cheese");
    }
}
