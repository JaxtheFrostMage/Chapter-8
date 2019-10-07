package Assignments;

import java.util.Scanner;

public class DistanceFromAverage {

    public static void main(String[] args) {

        int numOfInts = 0;
        double userEntry;
        double total = 0;
        double average;
        double[] allValues = new double[99999];
        boolean noEnteredNumber = true;

        Scanner input = new Scanner(System.in);

        System.out.println("When you have finished entering numbers, enter 99999.\n");
       /* do {


            System.out.println("Enter a number.");
            userEntry = input.nextDouble();
            if (userEntry >= 0 && userEntry <= 20){
                allValues[numOfInts] = userEntry;
                numOfInts++;
            total = total + userEntry;
            }else if (userEntry < 0 || userEntry > 20 && userEntry != 99999){
                System.out.println("That value was invalid.");
            }

        }while(userEntry != 99999);*/

       for(int i = 0; i < 99999; i++){

           System.out.println("Enter a number.");
           userEntry = input.nextDouble();
           if (userEntry >= 0 && userEntry <= 20){
               allValues[numOfInts] = userEntry;
               numOfInts++;
               noEnteredNumber = false;
               total = total + userEntry;
           }else if (userEntry < 0 || userEntry > 20 && userEntry != 99999){
               System.out.println("That value was invalid.");
           } else if (userEntry == 99999){
               i = i + 99999;
           }

       }
        average = total / numOfInts;

       if(noEnteredNumber){
           System.out.println("Error: no valid entry was made!");
       }

        System.out.println("Average is " + average);

        for (int i = 0; 0 < numOfInts; i++){
            if(allValues[i] > average){
                System.out.println(allValues[i] + " is " + (allValues[i] - average) + " above the average." );
            }else if(allValues[i] < average && allValues[i] != 0){
                System.out.println(allValues[i] + " is " + (average - allValues[i]) + " below the average." );
        } else if(allValues[i] == 0){
            }
            else {
                System.out.println(allValues[i] + " is the average." );
            }
        }
    }
}