package Homework3;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        /*Using scanner class create calculator.
        Allow user to enter 2 numbers and operator(+,-,*,/).
        Based on operator provide the result to user.*/
        Scanner input=new Scanner(System.in);
        System.out.println("Please choose an operator: +, -, *, /");
        char operator=input.next().charAt(0);
        System.out.println("Please enter first number");
        int number=input.nextInt();
        System.out.println("Please enter second number");
        int number2=input.nextInt();

        switch (operator){
            case '+':
                System.out.println(number+" + "+number2+" = "+(number+number2));
                break;
            case'-':
                System.out.println(number+" - "+number2+" = "+(number-number2));
                break;
            case'*':
                System.out.println(number+" * "+number2+" = "+(number*number2));
                break;
            case'/':
                System.out.println(number+" / "+number2+" = "+(number/number2));
            default:
                System.out.println("not specified");}


        }
    }

