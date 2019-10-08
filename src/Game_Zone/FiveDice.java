package Game_Zone;

import java.util.Random;

public class FiveDice {

    public static void main(String[] args)
    {
        Random rand = new Random();
        int[] dieRolls = new int[5];
        int[] comRolls = new int[5];

        System.out.print("You Rolled:");
        for(int i= 0; i < 5; ++i){
            int die = rand.nextInt(6)+1;
            dieRolls[i] = die;
            System.out.print(die + " ");
        }
        System.out.print("\n");

        System.out.print("Computer Rolled: ");
        for(int i= 0; i < 5; ++i){
            int die = rand.nextInt(6)+1;
            comRolls[i] = die;
            System.out.print(die + " ");
        }
        System.out.print("\n");

        sorting(dieRolls, comRolls);
    }

    public static void sorting(int dieRolls[], int comRolls[])
    {
        int [] amount = {0, 0, 0, 0, 0, 0};
        int [] comAmount = {0, 0, 0, 0, 0, 0};

        for(int i = 0; i < 5; i++)
        {
            if(dieRolls[i] == 1){
               amount[0]++;
            }
            else if(dieRolls[i] == 2){
                amount[1]++;
            }
            else if(dieRolls[i] == 3){
                amount[2]++;
            }else if(dieRolls[i] == 4){
                amount[3]++;
            }else if(dieRolls[i] == 5){
                amount[4]++;
            }else if(dieRolls[i] == 6){
                amount[5]++;
            }
        }

        for(int j = 0; j < 5; j++)
        {
            if(comRolls[j] == 1){
                comAmount[0]++;
            }
            else if(comRolls[j] == 2){
                comAmount[1]++;
            }
            else if(comRolls[j] == 3){
                comAmount[2]++;
            }else if(comRolls[j] == 4){
                comAmount[3]++;
            }else if(comRolls[j] == 5){
                comAmount[4]++;
            }else if(comRolls[j] == 6){
                comAmount[5]++;
            }
        }

        /*for(int j = 0; j < 6; j++)
        {
            System.out.println(amount[j]);
        }*/

        ofAKind(amount, comAmount);
    }

    public static void ofAKind(int amount[], int comAmount[])
    {
        int[] playerHand = {0,0,0,0,0};
        int[] computerHand = {0,0,0,0,0};
        int playerScore = 0;
        int computerScore = 0;

         /*playerFiveOfAKind
         playerFourOfAKind
         threeOfAKind
         pair
         high*/
        for(int i = 0; i < 6; i++)
        {
        if(amount[i] == 1){
            playerHand[0]++;
        }
        else if(amount[i] == 2){
            playerHand[1]++;
        }
        else if(amount[i] == 3){
            playerHand[2]++;
        }
        else if(amount[i] == 4){
            playerHand[3]++;
        }
        else if(amount[i] == 5){
            playerHand[4]++;
        }
    }
        for(int j = 0; j < 6; j++)
        {
            if(comAmount[j] == 1){
                computerHand[0]++;
            }
            else if(comAmount[j] == 2){
                computerHand[1]++;
            }
            else if(comAmount[j] == 3){
                computerHand[2]++;
            }
            else if(comAmount[j] == 4){
                computerHand[3]++;
            }
            else if(comAmount[j] == 5){
                computerHand[4]++;
            }
        }

        System.out.print("You rolled a ");
    if(playerHand[4] == 1){
            System.out.println("Five of a Kind");
        playerScore = playerScore + 70;
    } else if (playerHand[3] == 1){
        System.out.println("Four of a Kind");
        playerScore = playerScore + 60;
    } else if (playerHand[2] == 1 && playerHand[1] == 1){
        System.out.println("Full House");
        playerScore = playerScore + 50;
    } else if (playerHand[2] == 1){
        System.out.println("Three of a Kind");
        playerScore = playerScore + 40;
    } else if (playerHand[1] == 2){
        System.out.println("Double Pair");
        playerScore = playerScore + 30;
    } else if (playerHand[1] == 1){
        System.out.println("Pair");
        playerScore = playerScore + 20;
    } else{
        System.out.println("High Die");
        playerScore = playerScore + 10;
    }

        System.out.print("Computer rolled a ");
        if(computerHand[4] == 1){
            System.out.println("Five of a Kind");
            computerScore = computerScore + 70;
        } else if (computerHand[3] == 1){
            System.out.println("Four of a Kind");
            computerScore = computerScore + 60;
        } else if (computerHand[2] == 1 && computerHand[1] == 1){
            System.out.println("Full House");
            computerScore = computerScore + 50;
        } else if (computerHand[2] == 1){
            System.out.println("Three of a Kind");
            computerScore = computerScore + 40;
        } else if (computerHand[1] == 2){
            System.out.println("Double Pair");
            computerScore = computerScore + 30;
        } else if (computerHand[1] == 1){
            System.out.println("Pair");
            computerScore = computerScore + 20;
        } else{
            System.out.println("High Die");
            computerScore = computerScore + 10;
        }

        result(playerScore, computerScore);
    }

    public static void result(int playerScore, int computerScore){

        if(playerScore > computerScore){
            System.out.println("You Win!");
        }

    }

}
