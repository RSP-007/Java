import java.util.Scanner;
public class Hypotenuse {
    public static void main(String[] args){

        //HYPOTENUSE c=Math.sqrt(a^2+b^2)

        Scanner scanner= new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.println("Enter sida A:");
        a=scanner.nextDouble();
        System.out.println("Enter side B");
        b=scanner.nextDouble();

        c=Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("HYPOTENUSE= "+c);
    }
}
/*
Enter sida A:
3
Enter side B
4
HYPOTENUSE= 5.0
 */