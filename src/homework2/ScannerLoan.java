package homework2;

import java.util.Scanner;

public class ScannerLoan {
    public static void main(String[] args) {
        /*You are a loan specialist and you need to ask user what is the amount of loan is needed. If
        loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the amount of loan");
        int loanAmount=input.nextInt();
        if(loanAmount<=200000) {
            System.out.println("Lend the money");
        }else{
            System.out.println("Reject");
        }

    }
}
