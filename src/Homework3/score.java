package Homework3;

import java.util.Scanner;

public class score {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your quiz score");
        int quiz=input.nextInt();
        System.out.println("Please enter your mid term score");
        int midTerm=input.nextInt();
        System.out.println("Please enter your final score");
        int finalScore=input.nextInt();

        int average=(quiz+midTerm+finalScore)/3;

        if(average>90) {
            System.out.println("Grade=A");
        }if(average>=70&&average<90){
            System.out.println("Grade=B");
        }if(average>=50&&average<70){
            System.out.println("Grade=C");}
        if(average<50){
            System.out.println("Grade=F");
        }


    }

}
