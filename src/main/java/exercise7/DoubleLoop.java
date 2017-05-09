package exercise7;

/**
 * Created by DSQ7LH on 5/7/2017.
 * *7.	Create a main method that loops through a double array of integers. The loop should output the value of the greatest number. (10 points)
 *    a.	Requirements: Row > 5 and Col > 5
 *    b.	Define your double array
 */
public class DoubleLoop {
    public static void main(String[] args) {
        int colcount = 5;
        int rowcount = 6;
        int[][] WeeklyScores = {
                {1, 2, 3, 4, 5, 6},
                {60, 66, 80, 76, 92,101},
                {65, 74, 81, 50, 84,95},
                {73, 78, 78, 83, 87,93},
                {65, 66, 69, 63, 66,91},
                {77, 83, 88, 90, 96,99},
                {76, 85, 91, 95, 98,100}};
        int highestscore = WeeklyScores[0][0];
        for (int i = 0; i <= rowcount; i++) {
            for (int j = 0; j <= colcount; j++) {
                if (WeeklyScores[i][j] > highestscore) highestscore = WeeklyScores[i][j];
            }

        }
        System.out.println("The largest number is: " + highestscore);
    }
}
