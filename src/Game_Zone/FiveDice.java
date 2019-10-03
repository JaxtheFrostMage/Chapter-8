package Game_Zone;

import java.util.Random;

public class FiveDice {

    public static void main(String[] args){
        Random rand = new Random();
        int[] dieRolls = new int[5];
        int total = 0;

        for(int i= 0; i < 5; ++i){
            int die = rand.nextInt(6)+1;
            dieRolls[i] = die;
            System.out.println(die);
        }

        for(int j = 0; j < dieRolls.length; j++){
            total = total + dieRolls[j];
        }
        System.out.println("total = " + total);
    }
}
