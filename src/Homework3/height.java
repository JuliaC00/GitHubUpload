package Homework3;

import java.util.Scanner;

public class height {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter your height");
        int height=input.nextInt();
        if(height<60) {
            System.out.println("Short");}
        if(height>60&&height<=72){
            System.out.println("Medium");}
            if(height>72){
                System.out.println("Tall");}


        }

    }

