import java.util.Scanner;
public class WeightConversion {
    public static void main(String[] args){
        //WEIGHT CONVERSION PROGRAM
        //DECLARE VARIABLES
        //WELCOME MESSAGE
        //PROMPT FOR USER CHOICE
        //OPTION 1 TO CONVERT 1 LBS TO KGS
        //OPTION 2 TO CONVERT KGS TO LBS
        //ELSE PRINT NOT A VALID CHOICE

        Scanner scanner=new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.print("Weight conversion program:");
        System.out.print("1: Convert lbs to kgs:");
        System.out.print("2: Convert kgs to lbs:");

        System.out.println("Choose an option 1 or 2:");
        choice=scanner.nextInt();

        if(choice == 1){ // ==  comparison operator, = assignment operator
            System.out.print("Enter the weight in lbs:");
            weight =scanner.nextDouble();
            newWeight = weight* 0.453592;
            System.out.printf("New weight in kgs is:%.2f",newWeight);
        }
        else if(choice==2){
            System.out.println("Enter the weight in kgs:");
            weight= scanner.nextDouble();
            newWeight= weight* 2.20462;
            System.out.printf("New weight in lbs is:%.2f",newWeight);
        }
        else {
            System.out.print("That was not a valid choice.");
        }
        scanner.close();
    }
}
