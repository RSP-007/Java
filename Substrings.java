import java.util.Scanner;
public class Substrings {
    public static void main(String[] args){

        // .substring() = A method used to extract a portio of a string
        //                .substring(start,end)
        Scanner scanner =new Scanner(System.in);
        String email;
        String username;
        String domain;

        System.out.print("enter your email:");

        email=scanner.nextLine();

        if(email.contains("@")){
            username = email.substring(0,email.indexOf("@"));
            domain =email.substring(email.indexOf("@")+1);

            System.out.println("USERNAME:"+username);
            System.out.println("DOMAIN:"+domain);

        }
        else {
            System.out.println("email must contain @");
        }


        scanner.close();

    }
}
