public class j2darrays {
    public static void main(String[] args){

        //2D =AN ARRAY WHERE EACH ELEMENT IS AN ARRAY AKA MULTI DIMENSIONAL ARRAYS
        //    USEFUL FOR STORING A MATRIX OF DATA

        String[][] groceries={{"apple","orange","banana"},
                             {"potato","onion","carrot"},
                             {"chicken","pork","beed","fish"}};  //2D ARRAY

        groceries[0][0]="pineapple"; //[][] -row,column
        groceries[1][0]="celery";
        groceries[2][1]="eggs";

        for (String[] foods:groceries){
            for(String food:foods){
                System.out.print(food+" ");

            }
            System.out.println();

        }

    }
}
