package HW;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        //Generating name
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("\nWelcome " + name +" !");
        System.out.println("\nLet the game begin!");
        //Generating number
        final int number;
        Random rand = new Random();
        number = rand.nextInt(100);

        System.out.println("\nNumber has generated. Please enter the number you have predicted:");

        int[] num_arr = new int[30];
        int index = 0;
        int counter = 0;
        while (true) {
            int num_user = sc.nextInt();

            counter++;
            num_arr[index] = num_user;
            index++;
            if (num_user < number) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (num_user > number) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.println("Congratulations," + name + " !" );
                break;
            }
        }

        //Making and sorting of an array
        int[] num_arr_new;
        num_arr_new = Arrays.copyOfRange(num_arr,0, counter);
        int temp;
        for(int i = 0; i <= num_arr_new.length-1; i++)
        {
            for( int j = 0; j <= num_arr_new.length-2; j++)
            {
                if(num_arr_new[j] < num_arr_new[j+1])
                {
                    temp = num_arr_new[j];
                    num_arr_new[j] = num_arr_new[j+1];
                    num_arr_new[j+1] = temp;
                }
            }
        }


        System.out.println("Your numbers: " + Arrays.toString(num_arr_new));


    }
}

