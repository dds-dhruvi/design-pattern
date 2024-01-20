package src.decoratorPattern;

public class DecoratorPattern {
    public static void main(String[] args)  //static method
    {
        System.out.println("Static method");
//        The decorator pattern attached additional responsibilities to an object dynamically. Decorators
//        provide a flexible alternative to subclassing for extending functionality.
        Pizza pizzaCheeseAndBellPepper = new Margarita();
        pizzaCheeseAndBellPepper = new Cheese(pizzaCheeseAndBellPepper);
        pizzaCheeseAndBellPepper = new BellPeppers(pizzaCheeseAndBellPepper);
        System.out.println(pizzaCheeseAndBellPepper.getDescription());
        System.out.println(pizzaCheeseAndBellPepper.getCost());

        Pizza pizzaDoubleCheese = new CheesyVeg();
        pizzaDoubleCheese = new Cheese(pizzaDoubleCheese);
        pizzaDoubleCheese = new Cheese(pizzaDoubleCheese);
        System.out.println(pizzaDoubleCheese.getDescription());
        System.out.println(pizzaDoubleCheese.getCost());



    }

}
