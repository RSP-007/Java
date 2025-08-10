public class Printf {
    public static void main(String[] args){

        //printf()= is a method used to format output

        // %[flags][width][.precision][specifier-character]


        String name= "Spongebob";       //char -%c
        char firstLetter= 'S';          //string - %s
        int age=30;                     //double - %f
        double height =60.5;            //int - %d
        boolean isEmployed =true;       //boolean - %b

        System.out.printf("Hello %s\n",name); // we have to manually insert new line '\n' in printf
        System.out.printf("Your name starts with a %c\n",firstLetter);
        System.out.printf("You are %d years old",age);
        System.out.printf("You are %f tall",height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is  %d years old ",name,age);

    }
}
