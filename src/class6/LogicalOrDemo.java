package class6;

import java.util.Scanner;

public class LogicalOrDemo {
    public static void main(String[] args) {

        System.out.println("Please Enter the Day");
        Scanner scan=new Scanner(System.in);
        String day=scan.next();

        if(day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Friday")){
            System.out.println("no class today");
        }else if(day.equalsIgnoreCase("Saturday")|| day.equalsIgnoreCase( "Sunday")){
            System.out.println("Java class enjoy");
        }else if(day.equalsIgnoreCase("Wednsday")|| day.equalsIgnoreCase( "Tuesday")) {
            System.out.println("Manual Testing class");
        }else if (day.equalsIgnoreCase("Thursday")){
            System.out.println("Review class");
        }else{
            System.out.println("Wrong day entered");
        }
        scan.close();
    }
}
