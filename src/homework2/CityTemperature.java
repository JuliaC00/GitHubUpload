package homework2;
import java.util.Scanner;
public class CityTemperature {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter city");
        String name=input.nextLine();
        System.out.println("Please enter temperature");
        int tempF=input.nextInt();
        int tempC=(tempF-32)*5/9;
        System.out.println("The temperature in the city is "+tempC);
    }
    /*Create a Java program that will ask user to input city and temperature.
    Your program should convert Fahrenheit into celsius and print “The temperature is the city  is ”
     */
}
