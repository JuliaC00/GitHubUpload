package class4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        //below line help to get nput from the keyboard;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=input.nextLine();//nextLine is used when we have to take sentences from the keyboard;
        System.out.println("My name is "+name);
    }
}
