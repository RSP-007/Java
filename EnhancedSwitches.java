import java.util.Scanner;

public class EnhancedSwitches {
    public static void main(String[] args){
        //ENHANCED SWITCH = A REPLACEMENT TO MANY ELSE IF STATEMENTS
        //                  (JAVA 14 FEATURE

        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the day:");
        String day= scanner.nextLine();
        /*
        switch(day){
            case "Monday" -> System.out.println("It is a weekday😵‍💫");
            case "Tuesday" -> System.out.println("It is a weekday😵‍💫");
            case "Wednesday" -> System.out.println("It is a weekday😵‍💫");
            case "Thursday" -> System.out.println("It is a weekday😵‍💫");
            case "Friday" -> System.out.println("It is a weekday😵‍💫");
            case "Saturday" -> System.out.println("It is weekend‍😊");
            case "Sunday" -> System.out.println("It is weekend‍😊");
            default -> System.out.println(day + " is not a day");
         */

        switch(day){
            case "Monday","Tuesday","Wednesday","Thursday","Friday" -> System.out.println("It is a weekday😵‍💫");
            case "Saturday","Sunday" -> System.out.println("It is a weekday‍😊");
            default -> System.out.println(day+" is not a day");
        }

        scanner.close();
    }
}
