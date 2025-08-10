public class Printf2 {
    public static void main(String[] args) {

        //printf()= is a method used to format output

        // %[flags][width][.precision][specifier-character]
        double price1= 9000.99;
        double price2= 100000.15;
        double price3= -54000.01;

        //PRECISION
        System.out.printf("%.1f\n",price1);
        System.out.printf("%.2f\n",price2);
        System.out.printf("%.3f\n",price3);
        System.out.println("--------------------------------");

        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative,space if positive

        System.out.printf("%+.1f\n",price1);
        System.out.printf("%,.1f\n",price2);
        System.out.printf("%,.1f\n",price3);
        System.out.printf("%(.1f\n",price1);
        System.out.printf("% .1f\n",price1);

        System.out.println("________________________________");
        //[width]
        //0 =zero padding
        //number = right justified padding
        //negative number = left justified padding

        int id1= 1;
        int id2= 23;
        int id3= 456;
        int id4= 7890;
        System.out.println("ZERO PADDING");

        System.out.printf("%d\n", id1);
        System.out.printf("%d\n", id2);
        System.out.printf("%d\n", id3);
        System.out.printf("%d\n", id4);
        System.out.println("________________________________");
        System.out.println("4 PADDING");

        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);

        System.out.println("________________________________");
        System.out.println("number = right justified padding");

        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

        System.out.println("________________________________");
        System.out.println("negative number = left justified padding");

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);




    }
}
