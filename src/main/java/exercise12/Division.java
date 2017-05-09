package exercise12;

/**
 * Created by DSQ7LH on 5/8/2017.
 * 12.	Create a method that returns the division of two numbers. Implements try/catch for the ArithmeticException. (5 points)
 *    a.	Requirements: both numbers have to be passed as arguments
 */

public class Division {
    private int num1 = 10;
    private int num2 = 5;

    public int divideNums(int num1, int num2){
        try {
            int result = num1 / num2;
            System.out.println("The Answer is: "+result);
            return result;
        }
        catch(ArithmeticException ae){
            String error = ae.getMessage();
            System.out.println("Error: cannot "+error);
            return -1;
        }
    }
}
