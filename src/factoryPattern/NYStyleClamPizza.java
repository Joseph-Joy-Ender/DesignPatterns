package factoryPattern;

public class NYStyleClamPizza extends Pizza {

    public NYStyleClamPizza() {
         name = "NY Style Clam Pizza";
         dough = "48 hour Fermented Pizza Dough";
         sauce = "Garlic and Oil Sauce";
        toppings.add("Fresh littleneck clams");
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into classic triangle cut");
    }
}
