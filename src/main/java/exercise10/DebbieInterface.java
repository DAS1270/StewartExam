package exercise10;

/**
 * Created by DSQ7LH on 5/8/2017.
 * 10.	Create me an Interface that has one of each: 1 abstract method, 1 default method and 1 static method (10 points)
 *a.	Requirements: Static method must be called from default method
 */
public interface DebbieInterface {
    //Constant
    String message = "Interface Constant 'message'.";

    //Abstract Method
    abstract void returnAbMessage();

    //default method
    default void returnDefMessage() {
        System.out.println("This is the default method return message.");
        System.out.println(returnInterMessage());
    }

    //static method
    static String returnInterMessage(){
        System.out.println("This is the static method helper.");
        return message;
    }
}

