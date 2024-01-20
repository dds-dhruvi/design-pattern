package src.decoratorPattern;

public class Cheese extends Topping {

    Pizza pizza;

    public Cheese(Pizza pizza){
        this.pizza = pizza;
    }

    public String getDescription(){
        return pizza.getDescription() + " + cheese topping ";
    }

    @Override
    public int getCost(){
        return pizza.getCost() +100;
    }
}
