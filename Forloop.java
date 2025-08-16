import java.util.Scanner;

public class Forloop {
    public static void main(String[] args){

        //for loop= execute some code a certain amount of times

       /* for(int i=0;i<10;i++){
            System.out.println(i);
        }*/



        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter how many times you want to loop:");
        int max= scanner.nextInt();

        for(int i=1;i<=max;i++){
            System.out.println(i);
        }

        scanner.close();
/*
Enter how many times you want to loop:5
1
2
3
4

*/
    }
}
