package class4;

public class IfDemo1 {
    public static void main(String[] args) {
        int money = 15000;
        if (money > 1000) {
            System.out.println("Lets buy anIphone");
        }
        if (money > 2000) {
            System.out.println("Lets also buy a Macbook");
        }
        boolean mothersDay = true;
        if (mothersDay) {
            System.out.println("Happy Mother's day");
        }
        String name="Serdar";//relational operatives don't work with non-primitive data types; ctrl+option+L -to format the code
        if(name.equals("Serdar")){
            System.out.println("I love football");
        }

    }
}