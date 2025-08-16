import java.util.Scanner;
public class Tempconverter {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        double temp;
        double newTEmp;
        String unit;

        System.out.print("Enter the temperature:");
        temp= scanner.nextDouble();
        System.out.print("Enter the degree in celsius or faranheit(C or F):");

        unit= scanner.next().toUpperCase(); //nextLine not needed since only 1 character used, method chaining used in toUpper()

        newTEmp=(unit.equals("C")) ? (temp -32)* 5/9 : (temp * 5/9)+ 32;

        System.out.printf("%.2f°%s",newTEmp,unit);


    }

}

