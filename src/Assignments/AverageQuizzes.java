package Assignments;

import java.util.Scanner;

public class AverageQuizzes {

    public static void main(String[] args) {
        int userEntry;

        int score;
        int total = 0;
        int quit = 0;

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("how many students?");
            userEntry = input.nextInt();

            int[] scoreArray = new int[userEntry];
            for (int i = 0; i < scoreArray.length; i++) {
                System.out.println("enter quiz score number " + (i+1) + ".");
                score = input.nextInt();
                scoreArray[i] = score;
                total = scoreArray[i] + total;
            }

            System.out.println("The average is " + total / scoreArray.length);
          //  HighLow.displayHighLow(scoreArray);

            System.out.println("Are you finished? 999 to quit");
            quit = input.nextInt();
        } while (quit != 999);
    }
}
