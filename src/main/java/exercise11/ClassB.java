package exercise11;

/**
 * Created by DSQ7LH on 5/8/2017.
 */
public class ClassB {
    private String bMessage;

    public String getMessage() {
        return bMessage;
    }

    public void setMessage(String msg){
        bMessage=msg;
    }

    public void printbMessage(){
        System.out.println("Printing ClassB's message: "+bMessage);
    }
}
