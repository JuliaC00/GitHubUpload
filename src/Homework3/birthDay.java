package Homework3;

import java.util.Scanner;

public class birthDay {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter month of your birth");
        String month=input.nextLine();

       if(month.equals("June")||month.equals("July")||month.equals("August") ){
           System.out.println("You were born in Summer");}
       if(month.equals("September")||month.equals("October")||month.equals("November")){
           System.out.println("You were born in Autumn");}
       if(month.equals("December")||month.equals("January")||month.equals("February")){
           System.out.println("You were born in Winter");}
        if(month.equals("March")||month.equals("April")||month.equals("May")){
            System.out.println("You were born in Spring");}
       }
    }

