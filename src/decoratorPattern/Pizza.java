package src.decoratorPattern;

public abstract class Pizza {
    protected String description = "unknown ";
    public String getDescription(){
        return this.description;
    }

    public abstract int getCost();
}
