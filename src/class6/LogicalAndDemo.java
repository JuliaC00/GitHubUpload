package class6;

public class LogicalAndDemo {
    public static void main(String[] args) {
        String password="Pass13";
        if(!password.equals("Pass123")){
            System.out.println("wrong password");
        }

        boolean isRaining=true;
        if(!isRaining) {
            System.out.println("lets go for a walk");
        }else{
            System.out.println("lets take the umbrella");

        }


    }
}
