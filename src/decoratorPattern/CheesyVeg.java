package src.decoratorPattern;

public class CheesyVeg extends Pizza{

    public CheesyVeg(){
        this.description = "this is a cheesy veg pizza";
    }

    @Override
    public int getCost() {
        return 500;
    }
}
