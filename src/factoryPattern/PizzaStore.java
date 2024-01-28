package src.factoryPattern;

public abstract class PizzaStore {

    protected abstract Pizza createPizza(String type);


    public Pizza orderPizza(){

        Pizza pizza = createPizza("type");
        pizza.bake();
        pizza.cut();
        pizza.pack();
        return pizza;
    }

}
