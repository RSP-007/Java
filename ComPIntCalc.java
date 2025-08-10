import java.util.Scanner;
public class ComPIntCalc {
    public static void main(String[] args){

        //COMPOUND INTEREST = PRINCIPAL[1+RATE/N]^NT
        //N =NO OF TIMES COMPOUNDED PER YEAR
        //T =TOTAL YEARS

        Scanner sc =new Scanner(System.in);
        double principal;
        double rate;
        int totalyears;
        int timescompounded;
        double compoundinterest;

        System.out.print("enter the principal amount:");
        principal=sc.nextDouble();

        System.out.print("enter the rate in %:");
        rate=sc.nextDouble()/100;

        System.out.print("enter total years:");
        totalyears=sc.nextInt();

        System.out.print("enter times compounded:");
        timescompounded=sc.nextInt();

        compoundinterest=principal*(Math.pow(1+rate/timescompounded,timescompounded*totalyears));
        System.out.printf("AMOUNT AFTER %d years is $%f",totalyears,compoundinterest);

        sc.close();
            }
}
