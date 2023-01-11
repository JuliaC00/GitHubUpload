package homework1;

public class ArithmeticOperations2 {
    public static void main(String[] args) {
        //Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8. Your program should say.
        // “The perimeter of a rectangle with width  and height __ is equal to __ and the area is __”
        //The perimeter of a rectangle with width 5.0 and height 8.0 is equal to 26.0 and the area is 40.0
        float width=5.0f;
        float height=8.0f;
        System.out.println("The perimeter of a rectangle with width "+width+" and height "+height+" is equal to "+(2*(width+height))+" and the area is "+(width*height));
    }
}
