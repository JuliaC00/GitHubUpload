package Homework3;

public class WhileLoop3 {
    public static void main(String[] args) {
        //write a loop to print these number 5,10,15,20,25,30.... 50

        int number=1;
        while(number<=50){
            if(number%5==0)
                System.out.println(number);
            number++;
        }
    }
}
