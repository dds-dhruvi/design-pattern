package src.singletonPattern;

public class singletonObjectMethod1 {

    public String name;

    private static singletonObjectMethod1 instance;

    private singletonObjectMethod1(){
        this.name = "synchronized getInstance method";
    }

   /* By adding the synchronized keyword to getInstance() we force every thread to wait its turn
    before it can enter the method. That is, no two threads may enter the method at the same time.*/

//    SYNCHRONIZATION IS EXPENSIVE!!!!
    public static synchronized singletonObjectMethod1 getInstance(){
        if(instance == null){
            instance = new singletonObjectMethod1();
        }
        return instance;
    }




}
