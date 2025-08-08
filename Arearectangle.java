import java.util.Scanner;
public class Arearectangle {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        //Area of rectangle
        System.out.print("Enter length of rectangle:");
        double length=scanner.nextDouble();
        System.out.print("Enter width of rectangle:");
        double width=scanner.nextDouble();
        double area=(length*width);
        System.out.print("Area of rectangle="+area+"cm^2");
        scanner.close();
    }
}
/*OUTPUT:
Enter length of rectangle:22.5
Enter width of rectangle:10.5
Area of rectangle=236.25cm^2
 */
