package exercise4;

/**
 * Created by DSQ7LH on 5/7/2017.
 * 4.	Create a method that returns back the largest number in an array of integers (5 points)
 *       a.	The method should receive an array of integers
 */
public class LargestNum {
    public int findLargestNum(int vals[]) {
        //int[] nums = {4, 3, 9, 6, 15, 2};
        int lgst = vals[0];

        for (int i = 1; i < vals.length; i++) {
            if (vals[i] > lgst)
                lgst = vals[i];
            }
            return lgst;
        }
    }
