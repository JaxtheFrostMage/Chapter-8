package Game_Zone;

import java.util.Random;

public class FiveDice {

    public static void main(String[] args){
        Random rand = new Random();
        int[] dieRolls = new int[5];
        int[] comRolls = new int[5];

        System.out.print("\nYou Rolled: ");
        for(int i= 0; i < 5; ++i){
            int die = rand.nextInt(6)+1;
            dieRolls[i] = die;
            System.out.print(die + " ");
        }

        System.out.print("\nComputer Rolled: ");
        for(int i= 0; i < 5; ++i){
            int die = rand.nextInt(6)+1;
            comRolls[i] = die;
            System.out.print(die + " ");
        }

    }
}
