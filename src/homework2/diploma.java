package homework2;

public class diploma {
    public static void main(String[] args) {

        boolean diploma=false;
        float gpa=3.4f;
        if(diploma){
            System.out.println("Congratulations");
            if(gpa>=3.5){
                System.out.println("You are eligible for scolarship ");
            }else{
                System.out.println("You should have studied harde");
            }

        }else {
            System.out.println("Get a degree");
        }
    }
}
