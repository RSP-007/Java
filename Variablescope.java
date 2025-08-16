public class Variablescope {

    static int x=3; //Class variable

    public static void main(String[] args){
        //variable scope= where a variable can be accessed
        // a variable declared inside a method has a local scope

        int x=1; //LOCAL VARIABLE
        System.out.println(x);
        doSomething();
    }
    static void doSomething(){
        int x=2; //Local variable
        System.out.println(x);
    }
}
