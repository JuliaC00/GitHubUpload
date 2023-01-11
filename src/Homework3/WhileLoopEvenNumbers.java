package Homework3;

public class WhileLoopEvenNumbers {
    public static void main(String[] args) {
        //Print even numbers from 20 to 1 (2 ways)

        int number=20;
        while(number>0){

            if(number%2==0){
                System.out.println(number);
            }
            number--;
        }

        int number2=1;
        while(number2<20){
            if(number2%2!=0){
            }else{
                System.out.println(number2);
            }
            number2++;

        }
    }
}
