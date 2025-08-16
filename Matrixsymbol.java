import java.util.Scanner;

public class Matrixsymbol {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);
        int row;
        int column;
        char symbol;

        System.out.print("enter the number of rows:");
        row=scanner.nextInt();
        System.out.print("enter the number columns:");
        column=scanner.nextInt();
        System.out.print("enter the symbol:");
        symbol=scanner.next().charAt(0);

        for(int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print(symbol);
            }
            System.out.println();
        }


        scanner.close();
    }
}
