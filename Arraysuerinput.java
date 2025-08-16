import java.util.Scanner;

public class Arraysuerinput {
    public static void main(String[] args){

        Scanner scanner =new Scanner(System.in);
        String[] foods=new String[3];//empty array with space for 3 elements

        for(int i=0;i<foods.length;i++){
            System.out.print("Enter a food:");
            foods[i]=scanner.nextLine();
        }

        for(String food:foods){
            System.out.println(food);
        }



        scanner.close();
    }
}
