import java.util.Random;
import java.util.Scanner;

public class Dicerollingprgm {
    public static void main(String[] args) {

        //JAVA DICE ROLLER PROGRAM

        //DECLARE VARIABLES
        //GET # OF DICE FROM THE USER
        //CHECK IF # OF DICE > 0
        //ROLL ALL THE DICE
        //GET THE TOTAL
        //DISPLAY ASCII OF DICE

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numofDice;
        int total = 0;

        System.out.print("Enter the number of dice to roll:");
        numofDice = scanner.nextInt();


        if (numofDice > 0) {
            for (int i = 0; i < numofDice; i++) {
                int roll = random.nextInt(1, 7);
                printDice(roll);
                System.out.println("You rolled:" + roll+"\n");
                total += roll;
            }
            System.out.println("Total=" + total);

        } else {
            System.out.println("Entry must be greater than 0");
        }

        scanner.close();
    }

    static void printDice(int roll) {

        String dice1= """
                 -------
                |       |
                |   ●   |
                |       |
                 --------""";

        String dice2= """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------""";


        String dice3= """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------""";

        String dice4= """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------""";
        String dice5= """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------""";
        String dice6= """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------""";
        switch(roll){
            case 1->        System.out.println(dice1);
            case 2->        System.out.println(dice2);
            case 3->        System.out.println(dice3);
            case 4->        System.out.println(dice4);
            case 5->        System.out.println(dice5);
            case 6->        System.out.println(dice6);
        }
    }
}
