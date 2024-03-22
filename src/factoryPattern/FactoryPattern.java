package src.factoryPattern;

public class FactoryPattern {

    public static void main(String[] args){
        System.out.println("Testing the Factory Pattern");
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(pizza.name);

    }
}
