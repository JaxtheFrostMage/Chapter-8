package Assignments;

public class ArrayMethodDemo {

    public static void main(String[] args){

        int [] tenValues = {9, 27, 19, 47, 87, 22, 177, 30, 63, 91};

        display(tenValues);
        reverse(tenValues);
        sum(tenValues);
        lessThan(tenValues);
        greaterThanAverage(tenValues);

    }

    public static void display(int tenValues[]){

        for(int i = 0; i < 10; i++){

            System.out.print(tenValues[i] + " ");
        }
        System.out.print("\n");
    }

    public static void reverse(int tenValues[]){

        for(int i = 9; i > -1; i--){

            System.out.print(tenValues[i] + " ");
        }
        System.out.print("\n");
    }

    public static void sum(int tenValues[]){
        int total = 0;

        for(int i = 0; i < 10; i++){

            total = total + tenValues[i];
        }
        System.out.print("Total = " + total);
        System.out.print("\n");
    }

    public static void lessThan(int tenValues[]){

        System.out.print("Values lower then 75 ");
        for(int i = 0; i < 10; i++){

            if (tenValues[i] < 75) {
                System.out.print(tenValues[i] + " ");
            }
        }
        System.out.print("\n");
    }

    public static void greaterThanAverage(int tenValues[]){
        int total = 0;

        for(int i = 0; i < 10; i++){

            total = total + tenValues[i];
        }
        System.out.print("Values greater then average ");
        int average = total / 10;
        for(int i = 0; i < 10; i++){

            if (tenValues[i] > average) {
                System.out.print(tenValues[i] + " ");
            }
        }
        System.out.print("\n");
    }

}
