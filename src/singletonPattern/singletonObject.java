package src.singletonPattern;

public class singletonObject {

    public String name;

    private static singletonObject instance;

    private singletonObject(){
        this.name = "Dhruvi";
    }

   /* By adding the synchronized keyword to getInstance() we force every thread to wait its turn
    before it can enter the method. That is, no two threads may enter the method at the same time.*/

//    SYNCHRONIZATION IS EXPENSIVE!!!!
    public static synchronized singletonObject getInstance(){
        if(instance == null){
            instance = new singletonObject();
        }
        return instance;
    }




}
