package src.singletonPattern;

public class singletonObjMethod2 {

    public String name;
    /* creating an instance of the singleton in a stable initializer.
    this code is guaranteed to be thread safe
     */

    private static singletonObjMethod2 instance = new singletonObjMethod2();

    private singletonObjMethod2(){
        this.name = "eager instance method";
    }

    public static singletonObjMethod2 getInstance(){
        return instance;
    }
}
