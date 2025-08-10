import java.util.Scanner;
public class Circumareavol {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        //CIRCUMFERENCE= 2 * PI * RADIUS
        //AREA =PI * RADIUS^2
        //VOLUME=(4.0/3.0)* PI * RADIUS^3

        double Radius;
        double circumference;
        double area;
        double volume;

        System.out.print("enter radius of circle:");
        Radius=scanner.nextDouble();

        circumference=2*(Math.PI)*Radius;       //to print only 2 decimal  points use %.2f replace+ with ,
        System.out.printf("Circumference of circle is = %.1fcm",circumference); //and println with printf

        area=(Math.PI * (Math.pow(Radius, 2)));
        System.out.printf("\nArea of circle is = %.1fcm²",area);

        volume=(4.0/3.0)*(Math.PI)*Math.pow(Radius,3);
        System.out.printf("\nVolume of circle is = %.1fcm³",volume);

        scanner.close();
    }
}
