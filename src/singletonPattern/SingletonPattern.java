package src.singletonPattern;

public class SingletonPattern {

    public static void main(String[] args){
        singletonObject obj = singletonObject.getInstance();
        System.out.println(obj.name);
    }
}
