package Homework3;

public class WhileLoop2 {
    public static void main(String[] args) {
        //write a loop to print odd numbers from 1 to 15

        int number = 0;
        while (number <= 15) {
            if (number % 2 != 0)
                System.out.println(number);
            number++;

        }
    }
}