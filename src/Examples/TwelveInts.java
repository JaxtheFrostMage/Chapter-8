package Examples;

public class TwelveInts {

    public static void main(String[] args){

        int[] integers = {23, 45, 87, 12, 89, 91, 107, 443, 11, 6, 77, 999};

        for(int i = 0; i < 12; i++){
           System.out.println(integers[i]);
        }

        for(int j = 11; j > -1; j--){
            System.out.println(integers[j]);
        }
    }
}
