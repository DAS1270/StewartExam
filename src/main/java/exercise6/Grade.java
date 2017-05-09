package exercise6;

/**
 * Created by DSQ7LH on 5/7/2017.
 * 6.	Create a method that receives an integer argument from 0-100 and returns your test grade in a String format. (10 points)
 *     a.	Example: Input = 79	Output = “Your score of 79 got you a C.”
 */
public class Grade {
    public String convertGrade(int val){
        String phrase = "Return Grade";
        if (val < 70) phrase = "Your score of "+val+" got you a 'F.'";
        if (val >= 70 && val < 80) phrase = "Your score of "+val+" got you a 'C'.";
        if (val >= 80 && val < 90) phrase = "Your score of "+val+" got you a 'B'.";
        else if (val >= 90) phrase = "Your score of "+val+" got you a 'A'.";

        return phrase;
    }
}
