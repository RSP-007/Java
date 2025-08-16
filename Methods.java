public class Methods {
    public static  void main(String[] args){
        // method= a block of reusable code that is executed when called ()

     int age=35;
     if(ageCheck(age)){
         System.out.println("You may sign up");;
     }
     else {
         System.out.println("You must be 18+ to sign up");
     }
    }
    static void happyBirthday(String name, int age){   // and parameters to recieve value or variable
        System.out.println("happy birthday to you!"); //we can also rename the parameters ,can be diff from arguments
        System.out.printf("happy birthday dear you %s!\n",name);//methods are not familiar with variables inside of other methods
        System.out.printf("you are %d years old\n",age );

    }
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number*number*number;
    }
    static String getFullname(String first,String last){
        return first + " " + last;  // the return value here returns the value of mr code back to line 5 assigns it to fullName
    }

    static boolean ageCheck(int age){
        if (age>=18){
            return true;
        }
        else {
            return false;
        }
    }
}

