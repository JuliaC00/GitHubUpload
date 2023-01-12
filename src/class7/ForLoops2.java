package class7;

public class ForLoops2 {
    public static void main(String[] args) {
        //when you know how many times you want to loop through a block of code, use the far loop instead of a while loop.
        // When we don't know how many times we need to repeat a block of code we should be going with while loop
        // most of the time it happens when the user input is involved
       /* int number2=1;
        while(number2<20){
            if(number2%2!=0){
            }else{
                System.out.println(number2);
            }
            number2++;*/


        for(int i=0;i<20;i++){
            if(i%3!=0){
                System.out.println(i);
            }
        }
    }
}
