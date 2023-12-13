package src.intro;

public interface FlyBehaviour {
//    flyBehaviour is an interface that all flying classes implement. All new flying classes
//    just need to implement the fly method
    public default void fly(){}
}
