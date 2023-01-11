package Homework3;

import java.util.Scanner;

public class country {
    public static void main(String[] args) {
      /*Ask user to enter their country and capture it.
                Once values are captured print which language user speaks.*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your country");
        String country=scan.nextLine();

        switch(country){
            case "USA":
                System.out.println("English");
                break;
            case"China":
                System.out.println("Chinese");
                break;
            case"Italy":
                System.out.println("Italian");
                break;
            case"France":
                System.out.println("French");
                break;
            default:
                System.out.println("n/a");
    }
}}
