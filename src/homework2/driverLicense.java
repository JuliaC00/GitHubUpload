package homework2;

import java.util.Scanner;

public class driverLicense {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=input.nextInt();
        if(age>=18) {
            System.out.println("Issue driver license");
        }else{
            System.out.println("Get learners permit");
        }
        //You are DMV representative and you need to ask customer their age.
        //If they are 18 and older you will issue a driver licence to them, otherwise you will offer them to get a learners permit.
    }

    }
