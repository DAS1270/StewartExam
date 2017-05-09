package exercise9;

/**
 * Created by DSQ7LH on 5/8/2017.
 * 9.	Create me a class called ClassA that contains 2 private double fields and a default constructor.
 *       The constructor should default the values to zero. Use encapsulation for both private fields. (10 points)
 */
public class ClassA {
    private double field1;
    private double field2;

    public ClassA(double val1, double val2){
        field1=val1;
        field2=val2;
    }

    public ClassA(){
        field1 = 0;
        field2 = 0;
    };

    public void sendMsg(){
        System.out.println("Val1 = "+field1+"\nVal2 = "+field2);
    }
}
