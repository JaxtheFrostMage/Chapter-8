package Assignments;

import java.util.Scanner;

public class DistanceFromAverage {

    public static void main(String[] args) {

        int numOfInts = 0;
        int userEntry;
        int total = 0;
        int average;
        int[] allValues = new int[numOfInts + 1];

        Scanner input = new Scanner(System.in);

        System.out.println("When you have finished entering numbers, enter 99999.\n");
        do {


            System.out.println("Enter a number.");
            userEntry = input.nextInt();
            if (userEntry >= 0 && userEntry <= 20){
            numOfInts++;
            userEntry = allValues[numOfInts - 1];
            total = userEntry + userEntry;
            }else if (userEntry < 0 || userEntry > 20 && userEntry != 99999){
                System.out.println("That value was invalid.");
            }

        }while(userEntry != 99999);
        average = total / numOfInts;

        for (int i = 0; 0 < numOfInts; i++){
            if(allValues[i] > average){
                System.out.println(allValues[i] + " is " + (allValues[i] - average) + " above the average." );
            }else if(allValues[i] < average){
                System.out.println(allValues[i] + " is " + (average - allValues[i]) + " below the average." );
        } else {
                System.out.println(allValues[i] + " is the average." );
            }
        }
    }
}