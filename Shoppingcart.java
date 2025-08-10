import java.util.Scanner;
public class Shoppingcart {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);
        String item;
        double price;
        int quantity;

        System.out.print("What item would you like to buy?:");
        item=scanner.nextLine();

        System.out.print("What is the price for each?:");
        price=scanner.nextDouble();

        System.out.print("How many would you like?:");
        quantity=scanner.nextInt();
        System.out.println();

        System.out.println("You have bought "+quantity+" "+item);
        System.out.println("Your total is $"+price*quantity);

        scanner.close();

    }
}
