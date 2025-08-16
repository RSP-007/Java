import java.util.Arrays;
public class Arrayss {
    public static void main(String[] args){

        //array= a collection of values of the same data type
        //       * think of it as a variable that can store more than 1 value *

        String[] fruits={"apple","orange","banana","coconut"};
        //int numofFruits= fruits.length;
        //Arrays.sort(fruits); // tosort arrays alphabetically import java.util.Arrays;
        Arrays.fill(fruits,"pineapples"); //fills array with a specific value

        for(String fruit: fruits){  //enhanced for loop will cycle once for each element within an array
            System.out.println(fruit);  //fruit is unique identifier

        }
    }


}
