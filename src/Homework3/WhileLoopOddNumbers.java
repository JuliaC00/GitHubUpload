package Homework3;

public class WhileLoopOddNumbers {
    public static void main(String[] args) {

/* Print odd numbers between 20 and 50 (2 ways) */
        int number=20;
        while(number<50) {

            if (number % 2 != 0) {
                System.out.println(number);
            }
            number++;
        }
            int number2=20;
            while(number2<50){
                if(number2%2==0){
                }else{
                    System.out.println(number2);
                }
                number2++;
            }
            }}
