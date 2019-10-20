package HW3;

import java.util.Scanner;

public class Weekplanner {
   public static void main(String[] args) {

        String[][] scedule = new String[7][2];
        Scanner s=new Scanner(System.in);

        scedule[0][0] = "Sunday";
        scedule[0][1] = "do home work";

        scedule[1][0] = "Monday";
        scedule[1][1] = "go to courses; watch a film";

        scedule[2][0] = "Tuesday";
        scedule[2][1] = "do home work";

        scedule[3][0] = "Wednesday";
        scedule[3][1] = "study hard";

        scedule[4][0] = "Thursday";
        scedule[4][1] = "wait for Friday";

        scedule[5][0] = "Friday";
        scedule[5][1] = "party hard";

        scedule[6][0] = "Saturday";
        scedule[6][1] = "go out with friends";


        while(true) {
            System.out.println("\nPlease, input the day of the week: ");
            // in order to avoid spaces
            String str = s.nextLine().strip();

            if(scedule[0][0].compareToIgnoreCase(str) == 0) {
                System.out.printf("Your tasks for %s : %s. \n", scedule[0][0], scedule[0][1]);
                continue;
            }
            if (scedule[1][0].compareToIgnoreCase(str) == 0) {
                System.out.printf("Your tasks for %s : %s. \n", scedule[1][0], scedule[1][1]);
                continue;
            }
            if (scedule[2][0].compareToIgnoreCase(str) == 0) {
                System.out.printf("Your tasks for %s : %s. \n", scedule[2][0], scedule[2][1]);
                continue;
            }
            if (scedule[3][0].compareToIgnoreCase(str) == 0){
                System.out.printf("Your tasks for %s : %s. \n", scedule[3][0], scedule[3][1]);
                continue;
            }
            if(scedule[4][0].compareToIgnoreCase(str) == 0) {
                System.out.printf("Your tasks for %s : %s. \n", scedule[4][0], scedule[4][1]);
                continue;
            }
            if(scedule[5][0].compareToIgnoreCase(str) == 0) {
                System.out.printf("Your tasks for %s : %s. \n", scedule[5][0], scedule[5][1]);
                continue;
            }
            if(scedule[6][0].compareToIgnoreCase(str) == 0) {
                System.out.printf("Your tasks for %s : %s. \n", scedule[6][0], scedule[6][1]);
                continue;
            }
            if("exit".compareToIgnoreCase(str) == 0) break;

            else System.out.println("Sorry, I don't understand you, please try again. ");

        }
    }
}
