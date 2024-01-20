package src.strategyPattern;

public class StrategyPattern {
    public static void main(String[] args)  //static method
    {
        System.out.println("Static method");
        strategyDesignPattern();
    }

    public static void strategyDesignPattern(){
        Sara sara = new Sara();
        sara.display();
        sara.fly();
        sara.swim();
    }


}
