import java.sql.SQLOutput;
import java.util.Scanner;
public class Userinput {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name= scanner.nextLine();

        System.out.print("Enter you age:");
        int age = scanner.nextInt();

        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student?(true/false):");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello "+name);
        System.out.println("You are "+age+" "+"years old");
        System.out.println("Your gpa is: "+ gpa);
        System.out.println("Student:" +isStudent);

        if(isStudent){
            System.out.println("You are enrolled as a student");
        }
        else{
            System.out.println("You are not enrolled as a student");
        }
        //Common issue with entering string after integer: \n gets accepted as string from int sol:put another scanner.nextLine() input so assignment

        System.out.print("Enter age again:");
        int age2 =scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter you favourite color again:");
        String color = scanner.nextLine();

        System.out.println("Your age:"+age2);
        System.out.println("Favourite color:"+color);


        scanner.close();
    }




}
/*OUTPUT:
Enter your name: MR Code
Enter you age:25
What is your gpa: 8.5
Are you a student?(true/false):true
Hello MR Code
You are 25 years old
Your gpa is: 8.5
Student:true
You are enrolled as a student
Enter age again:23
Enter you favourite color again:blue
Your age:23
Favourite color:blue

 */
