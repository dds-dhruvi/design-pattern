package src.factoryPattern;

public class Pizza {

    String name;
    String toppings;

    Pizza(){
        this.name = "";
        this.toppings = "";
    }

    void bake(){
        System.out.println("baking the pizza");
    }

    void cut(){
        System.out.println("cutting the pizza");
    }

    void pack(){
        System.out.println("packing the pizza");
    }


}
