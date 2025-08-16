public class Logicaloperators {
    public static void main(String[] args){

        //     && = AND
        //     || = OR
        //     !  = NOT

        double temp =20;
        boolean isSunny=false;

        if(temp <= 10 && temp >= 0){
            System.out.println("The weather is good😊");
        }
        else if(temp <= 30 && temp >= 0 && !isSunny ){
            System.out.println("The weather is good😊");
            System.out.println("It is sunny outside☁️");
        }
        else if (temp > 30 || temp < 0){
            System.out.println("The weather is bad🌧️");
        }
    }
}
/*
The weather is good
It is sunny outside

 */
