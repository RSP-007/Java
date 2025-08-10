// RANDOM NUMBERS

import java.util.Random;
public class Random2 {
    public static void main(String[] args){

        Random random= new Random();
        int number1;
        int number2;


        number1=random.nextInt(); //default generates from -2 billion 2 billion
        number2=random.nextInt(1 ,7); // can set like(1,7) 7 wont show up
                                                  // 1 is inclusive , 7 exclusive here.
        System.out.println(number1);
        System.out.println(number2);

        double number3;
        number3=random.nextDouble(); // default b/w 0 & 1 decimal numbers.

        boolean isHeads;
        isHeads= random.nextBoolean();

        if(isHeads){
            System.out.println("Heads");
        }
        else {
            System.out.println("Tails");
        }

    }
}
