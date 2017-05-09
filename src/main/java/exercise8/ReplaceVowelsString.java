package exercise8;

import java.util.ArrayList;

/**
 * Created by DSQ7LH on 5/7/2017.
 * 8. Replace all vowels inside an array with a character (10 points)
 * a.	Requirements: String and character need to be passed to the method as arguments
 * b.	Requirements: method should print the new string and return the number of characters that got replaced
 */

public class ReplaceVowelsString {
    private String str1 = "Replace all vowels with an *.";
    private char replace = '*';

    public void replaceVowels(String str1, char replace) {

        int count = 0;
        char[] arrString = str1.toCharArray();

        for (int i = 0; i < arrString.length; i++) {
            if (arrString[i] == 'a' ||
                    arrString[i] == 'e' ||
                    arrString[i] == 'i' ||
                    arrString[i] == 'o' ||
                    arrString[i] == 'u' ||
                    arrString[i] == 'A' ||
                    arrString[i] == 'E' ||
                    arrString[i] == 'I' ||
                    arrString[i] == 'O' ||
                    arrString[i] == 'U') {
                        arrString[i] = replace;
                        count++;
            }
        }
        System.out.println(arrString);
        System.out.println(count+" vowels replaced.");
    }
}

