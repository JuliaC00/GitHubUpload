package homework2;
import java.util.Scanner;
public class YearsSalary {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of worked years");
        System.out.println("Enter your annual salary");
        int years=input.nextInt();
        int salary=input.nextInt();
        if(years>=5) {
            System.out.println("User s eligible for the bonus");
            if(salary>50000) {
                System.out.println("Bonus is 5000");
            }else{
                System.out.println("Bonus is 3000");
            }
        }else{
            System.out.println("User is not eligible for the bonus");
        }

    }
    /*Write a program to ask user to enter numbers of worked years and annual salary.
    If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is not.
    Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
     */



}
