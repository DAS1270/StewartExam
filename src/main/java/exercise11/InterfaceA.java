package exercise11;

/**
 * Created by DSQ7LH on 5/8/2017.
 * 11.	Create me a class called ClassA that uses inheritance with ClassB and implements InferfaceA. (5 points)
 *      a.	Requirements: Add Constants to Interface (at least one)
 */
public interface InterfaceA {
    //Constant
    String message = "This is the Interface's message.";

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
