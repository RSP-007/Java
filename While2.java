import java.util.Scanner;

public class While2 {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        String response="";

        while(!response.equals("Q")){
            System.out.println("You are playing a game");
            System.out.print("Press Q to quit the game:");
            response =scanner.next().toUpperCase();
        }
        System.out.println("You have quit the game");

        scanner.close();


    }
}
/*
You are playing a game
Press Q to quit the game:f
You are playing a game
Press Q to quit the game:w
You are playing a game
Press Q to quit the game:r
You are playing a game
Press Q to quit the game:q
You have quit the game

 */