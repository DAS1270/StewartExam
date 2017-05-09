package exercise5;

/**
 * Created by DSQ7LH on 5/7/2017.
 * 5.	Create a method that returns a random number from 1-100 (3 points)
 */
public class Random {
    public int generateNum() {
        int rangeFactor = 100;
        int num = (int) (Math.random() * rangeFactor);
        return num;
    }
}

