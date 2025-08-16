public class Ternaryoperator {
    public static void main(String[] args){

        //TERNARY OPERATOR ?= RETURN 1 OF 2 VALUES IF A CONDITION IS TRUE
        //VARIABLE = (condition) ? ifTrue :ifFalse;

        int score=70;
        String passOrFail =(score>=60) ? "PASS": "FAIL";
        System.out.println(passOrFail);

        int number =3;
        String evenOrOdd =(number % 2 ==0) ? "EVEN": "ODD";
        System.out.println(evenOrOdd);

        int hours=13;
        String timeOfDay =(hours <12)? "A.M.":"P.M.";
        System.out.println(timeOfDay);

        int income=60000;
        double taxrate=(income>=40000)? 0.25 :0.15;
        System.out.println(taxrate);
    }
}
/*
PASS
ODD
P.M.
0.25

 */