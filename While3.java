import java.util.Scanner;

public class While3 {
        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);

            int age=0;
            do{
                System.out.println("your age cant be negative");
                System.out.print("enter your age:");
                age=scanner.nextInt();
            }while(age<0);
                System.out.println("You are "+age+" years old");
            scanner.close();
        }
    }

/*
your age cant be negative
enter your age:-12
your age cant be negative
enter your age:11
You are 11 years old

 */