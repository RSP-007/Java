import java.util.Random;
import java.util.Scanner;

public class Numberguessinggame {
    public static void main(String[] args) {


        //NUMBER GUESSING GAME

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts=0;
        int randomNumber = random.nextInt(1, 11);

        System.out.println("NUMBER GUESSING GAME:");
        System.out.println("Guess the number b/w 1 & 10");

        do{
            System.out.print("Enter a guess:");
            guess= scanner.nextInt();
            attempts++;

            if(guess<randomNumber){
                System.out.println("too low try again");
            }
            else if (guess>randomNumber){
                System.out.println("too high  try again");
            }
            else {
                System.out.println("yes correct number" +randomNumber);
                System.out.println("Number of attempts "+attempts);
            }
        }while(guess!= randomNumber);

        scanner.close();

    }
}
