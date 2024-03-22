package src.singletonPattern;

public class SingletonPattern {

    public static void main(String[] args){
        singletonObjectMethod1 obj = singletonObjectMethod1.getInstance();
        System.out.println(obj.name);

        singletonObjMethod2 obj2 = singletonObjMethod2.getInstance();
        System.out.println(obj2.name);
    }
}
