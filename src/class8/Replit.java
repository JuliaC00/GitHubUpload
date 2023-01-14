package class8;

import java.util.Scanner;

public class Replit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number");
        int x= input.nextInt();
        for(int i=0;i<x; i++){
            System.out.print(i+" ");
        }
    }
}
