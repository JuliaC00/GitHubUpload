package class2;

public class Variables {
    public static void main(String[] args) {
        /*
        Below line is reserving a box in the coputers memory.
        We are calling it box1 if we need the info that we are storing inside this box
        we can simply say to the computer gives us the contents of box1.
        int=>what type of data we want to store
        box1=> is the name of the box
        = sign will take whatever we write after it and will store it inside the box1
        10=> is what we are storing inside the box
 */
        int box1=10;//if we are printing something from a box we don't need ""
        System.out.println(box1);
        /* To store whole numbers (Numbers without decimals points) we have 4 different types of boxes.
        1)byte 2)short 3) int 4)long
         */
        byte box2=127; //range for byte is from -128 to 127 if we need to store larger numbers we should try short
        byte box3=-128;
        short box4=32767;
        int  biggerBox=123456484;//most common type of box
        long maxBox=151313551526727l;
        short myBox=10000;
        System.out.println(myBox);

    }
}
