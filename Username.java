import java.util.Scanner;

public class Username {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        //username must be b/w 4-12 characters
        //username must not contain spaces or underscores

        String username;
        System.out.print("ENTER YOUR USERNAME:");
        username=scanner.nextLine();

        if(username.length()<4 || username.length()>12){
            System.out.print("Username must be 4-12 characters");
        }
        else if (username.contains(" ")|| username.contains("_")){
            System.out.println("Username must not contain spaces or underscores");
        }
        else{
            System.out.println("Welcome "+username);
        }

        scanner.close();


    }
}
