package src.decoratorPattern;

public class BellPeppers extends Topping{

    Pizza pizza;

    public BellPeppers(Pizza pizza){
        this.pizza = pizza;
    }

    public String getDescription(){
        return pizza.getDescription() + " + bell pepper toppings ";
    }


    @Override
    public int getCost() {
        return pizza.getCost() + 100;
    }
}
