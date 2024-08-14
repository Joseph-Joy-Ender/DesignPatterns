package factoryPattern;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza;
        pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Joy ordered a " + pizza.getName() + "\n");

        pizza = chicagoPizzaStore.orderPizza("veggie");
        System.out.println("Chicago ordered a " + pizza.getName() + "\n");
    }
}
