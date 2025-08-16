public class Overloadedmethods {
    public static void main(String[] args) {

        //overloaded methods =methods that share the same name,
        //                    but diff parameters
        //                    signature= name + parameters
        //                    each method signature is unique

        System.out.println(add(1, 2, 3));
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }
}
