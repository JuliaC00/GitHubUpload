package class5;

public class LogicalOperator {
    public static void main(String[] args) {
        boolean wifi=true;
        boolean fiveG=true;

        if(wifi||fiveG) {
            System.out.println("you are good for browsing internet");
        }else{
            System.out.println("Either connect to wifi or to 5G");
        }
    }
}
