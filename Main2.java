public class Main2 {
    public static void main(String[] args){
        int age =21;
        int year=2025;
        int quantity=1;
        System.out.println(age);
        System.out.println(quantity);
        System.out.println("The year is " +year);
        double price= 19.99;
        double gpa= 3.5;
        double temperature=-12.5;

        System.out.println("$"+price);
        char grade ='A';
        char symbol='!';
        char currency='$';
        System.out.println(currency);
        boolean isStudent= true;
        boolean isOnline= false;
        System.out.println(isStudent);
        System.out.println(isOnline);

        if(isStudent){
            System.out.println("You are a student");
        }
        else{
            System.out.println("Not student");
        }

        String name="Bro Code";
        System.out.println(name);
        System.out.println("Hello "+name);
        String food="bbq";
        String email="fake1234@gmail.com";
        System.out.println("favourite "+food);
        System.out.println("Email address "+email);
        System.out.println("--------------------------------------------------------------");
        System.out.println("Hello your name is: "+name +"\nYour favourite food: "+food +"\nyour car:unknown"+"\nYour email "+email);

        if (isStudent){
            System.out.println("There is a "+food+" "+"ready for pickup");
        }
        else{
            System.out.println("There is no "+ food);
        }
    }
}
/*OUTPUT:
21
1
The year is 2025
$19.99
$
true
false
You are a student
Bro Code
Hello Bro Code
favourite bbq
Email address fake1234@gmail.com
--------------------------------------------------------------
Hello your name is: Bro Code
Your favourite food: bbq
your car:unknown
Your email fake1234@gmail.com
There is a bbq ready for pickup

 */
