

public class FinallyKeyword {
    public static void main(String[] args) {
        try{
            int c = 2 / 0;
        }catch(ArithmeticException e){
            System.out.println("Cannot Divide By 0");
        }finally{
            System.out.println("Finally Executed!");
        }
    }
}
