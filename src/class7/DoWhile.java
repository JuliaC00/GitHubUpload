package class7;
import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int number;
        do {
            System.out.println("Please Enter a Number");
            number = scanner.nextInt();
        }while(number!=5);

        int number2=5;
        while(number2!=5){
            System.out.println("Please enter the number");
            number2 = scanner.nextInt();
        }
        }

    }

