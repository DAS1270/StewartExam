package exercise2;

/**
 * Created by DSQ7LH on 5/5/2017.
 * 2.	Create a class called MyClass, with a main method that prints in new lines the following array of values (5 points)
 *     a.	Apple, Orange, Pineapple, Banana, Berry, Peach
 */
public class MyClass {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Orange", "Pinapple", "Banana", "Berry", "Peach"};
        for (String tempFruits : fruits) {
            System.out.println(tempFruits);
        }
    }
}
