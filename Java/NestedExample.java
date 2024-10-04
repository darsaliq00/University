

public class NestedExample {
    public static void main(String[] args) {
        try{
            try{
                // Trying to divide by 0
                int c = 2/0;
            }catch(ArithmeticException e){
                System.out.println("Cannot Divide By Zero!");
            }

            try{
                // assigning out of bound array
                int a[] = new int [4];
                a[5] = 10;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array Out of Bound");
            }
        }catch(Exception e){
            System.out.println("Exception Handled!");
        }
    }
}
