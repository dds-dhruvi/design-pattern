package src;

import src.strategyPattern.Sara;

public class Main {
    public static void main(String args[])  //static method
    {
        System.out.println("Static method");
        designPatternIntro();
    }

    public static void designPatternIntro(){
        Sara sara = new Sara();
        sara.display();
        sara.fly();
        sara.swim();
    }
}
