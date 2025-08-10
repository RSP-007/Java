import java.util.Scanner;
public class If {
    public static void main(String[] args){

        //if statement =performs a block of code if its condition is true
        Scanner scanner= new Scanner(System.in);

        String name ;
        System.out.print("Enter your name:");
        name=scanner.nextLine();

        int age ;
        System.out.print("Enter your age:");
        age=scanner.nextInt();

        boolean isStudent;
        System.out.println("Are you a student(true/false):");
        isStudent=scanner.nextBoolean();


        //GROUP1
        if (name.isEmpty()){   //  isEmpty is an inbuilt command to check if string empty
            System.out.println("You didn't enter your name😵‍💫!");
        }
        else{
            System.out.println("Hello "+name+"!😊");
        }


        //GROUP2
        if(age>=65) {
            System.out.println("You are an senior!🤠");
        }
        else if (age>=19) {
            System.out.println("You are an adult!🤠");
        } else if (age<0) {
            System.out.println("You have not been born yet👌!");
        }
        else if (age==0) {
            System.out.println("You are a baby👶");
        }
        else{
            System.out.println("You are not an adult!👶");
        }

        //GROUP3
        if(isStudent){
            System.out.println("You are a student🧑‍🎓");
        }
        else{
            System.out.println("You are not a student👶");
        }

        scanner.close();

    }
}
