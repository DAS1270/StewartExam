package exercise11;

/**
 * Created by DSQ7LH on 5/8/2017.
 */
public class ClassA extends ClassB implements InterfaceA {
        private String aMessage;

    public void getaMessage(String msg1) {
        aMessage = msg1;
    }

    public void setMessage(String msg) {
        super.setMessage(msg);
    }

    public void returnAbMessage() {
        System.out.println("This message implements the Interface abstract method");
    }
}

