import java.util.Scanner;

public class Bankingprgm {
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args){

        //JAVA BANKING PROGRAM FOR BEGINNERS
        //DECLARE VARIABLES
        //DISPLAY MENU
        //GET AND PROCESS USERS CHOICE
        //showBalance()
        //deposit()
        //withdraw()
        //EXIT MESSAGE

        int choice;
        boolean isRunning = true;
        double balance=0;

        while(isRunning){
            System.out.println("**************");
            System.out.println("BANKING PROGRAM");
            System.out.println("**************");
            System.out.println("1. Show Balance:");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice(1-4):");
            choice=scanner.nextInt();
            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> {
                    balance=balance +deposit();
                    System.out.println();
                }
                case 3 -> {
                    balance=balance- Withdraw(balance);
                    System.out.println();
                }
                case 4 -> isRunning=false;
                default -> System.out.println("\nINVALID CHOICE");
            }

        }
        System.out.println("\n***************************");
        System.out.println("Thankyou have a nice day!");
        System.out.println("***************************");
        scanner.close();

    }
    static void showBalance(double balance){
        System.out.printf("BALANCE= $%.2f\n",balance);
        System.out.println();
    }
    static double deposit(){
        System.out.print("Enter amount to deposit:$");
        double amount;
        amount=scanner.nextDouble();
        if (amount<0){
            System.out.println("amount cant be negative");
            System.out.println();
            return 0;
        }
        else{
            return amount;
        }
    }
    static double Withdraw(double balance){
        System.out.print("Enter the amount to be withdrawn:$");
        double amount;
        amount= scanner.nextDouble();
        if (amount>balance){
            System.out.println("Insufficient funds\n");
            return 0;
        }
        else if(amount==0){
            System.out.println("YOU CANT WITHDRAW ZERO AMOUNT \n");
            return 0;
        }
        else if(amount<0){
            System.out.println("amount cant be negative\n");
            return 0;
        }
        else{
            return amount;
        }
    }
}




