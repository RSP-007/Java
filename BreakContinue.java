public class BreakContinue {
    public static void main(String[] args){

        //break= break out of the loop
        //continue= skip current iteration of a loop (SKIP)

        for(int i=0;i<10;i++){
            if(i==5){
                continue;
            }
            System.out.println(i +" ");
        }

    }
}
/*
0
1
2
3
4
6
7
8
9
 */