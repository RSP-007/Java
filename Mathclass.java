public class Mathclass {
    public static void main(String[] args){


        System.out.println(Math.PI);
        System.out.println(Math.E);//EXPONENTIAL CONSTANT

        double result;

        result =Math.pow(2 ,3); // 2 to the power 3 here
        System.out.println("POWER "+result);

        result=Math.abs(-5);
        System.out.println("ABSOLUTE "+result);

        result=Math.sqrt(9);
        System.out.println("SQRT "+result);

        result= Math.round(3.14);
        System.out.println("ROUND "+result);

        result=Math.ceil(result); //round up - ceil
        System.out.println("ROUND UP "+result);

        result=Math.floor(result);//round down -floor
        System.out.println("ROUND DOWN "+result);

        result=Math.max(10,20);//selects grater number here 20
        System.out.println("MAX "+result);

        result=Math.min(10,20);
        System.out.println("MIN "+result);




    }
}
