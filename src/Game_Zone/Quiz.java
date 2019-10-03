package Game_Zone;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args){

        String playerInput;
        int correct = 0;
        String[] userInput = new String[10];
        String[] answers = {"A", "B", "A", "C", "B", "B", "C", "A", "B", "C"};

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            System.out.println("What is the answer for question " + (i + 1) + " ?");
            playerInput = input.next();

            if (playerInput.equalsIgnoreCase("a") || playerInput.equalsIgnoreCase("b") ||
                    playerInput.equalsIgnoreCase("c")){
                userInput[i] = playerInput;
                if(userInput[i] == answers[i]){
                    System.out.println("Correct!");
                    correct++;
                } else {
                    System.out.println("incorrect, the right answer was " + answers[i] + "\n");
                }
            } else {
                System.out.println("Invalid answer, please try again.");
                i--;
            }

        }
    }
}
