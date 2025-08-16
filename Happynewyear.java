import java.util.Scanner;
public class Happynewyear {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the counter to start from:");
        int start= scanner.nextInt();

        for(int i = start;i>0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("HAPPY NEW YEAR");
    }
}
