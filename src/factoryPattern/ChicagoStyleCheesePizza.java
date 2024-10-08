package factoryPattern;

public class ChicagoStyleCheesePizza extends Pizza{

    public ChicagoStyleCheesePizza() {
         name = "Chicago Style Deep Dish Cheese Pizza";
         dough = "Extra Thin Crust Dough";
         sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square cheese");
    }
}
