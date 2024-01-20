package src.decoratorPattern;

public class Margarita extends Pizza{

    public Margarita(){
        this.description = "this is a margarita pizza";
    }

    @Override
    public int getCost() {
        return 400;
    }
}
