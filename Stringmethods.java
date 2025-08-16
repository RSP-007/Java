public class Stringmethods {
    public static void main(String[] args){

        String name= "MR CODE";
        int length = name.length();

        char letter =name.charAt(0); //charAt gives the character or element at specific index
        int index= name.indexOf("M");//indexOf gives the index of string
        int lastIndex =name.lastIndexOf("O");
        name= name.toUpperCase(); // to uppercase all
        name=name.toLowerCase(); // to lowercase all
        name=name.trim();     // to remove all blank spaces before & after string
        name=name.replace("o","a"); // to replace character with another

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name);

        if (name.isEmpty()){
            System.out.println("your name is empty");
        }
        else{
            System.out.println("hello "+name);
        }
        if(name.contains(" ")){
            System.out.println("your name contains space");
        }
        else {
            System.out.println("your name doesn't contain any spaces ");
        }
        if(name.equals("password")){    // to ignore case sensitivity use:-  name.equalsIgnoreCase{}
            System.out.println("your name cannot be password");
        }
        else {
            System.out.println("hello "+name);
        }
    }
}
