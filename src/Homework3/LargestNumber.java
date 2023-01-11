package Homework3;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        int number1, number2, number3;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 3 numbers");

        number1=scanner.nextInt();
        number2=scanner.nextInt();
        number3=scanner.nextInt();

        if (number1>number2&&number1>3) {
                System.out.println(number1 + " is the largest");
            }else if (number2 > number3&&number2>number3) {
                    System.out.println(number2 + " is the largest");
            }else if (number3 > number1&&number3>number2) {
                    System.out.println(number3 + " is the largest");
                }
            }
        }