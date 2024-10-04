package CSE355C;



import java.util.Scanner;

public class Fibonacii {
    public static void main(String[] args) {
        Scanner ins = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = ins.nextInt();

        int a = 0;
        int b = 1;

        System.out.println(a + " " + b);

        for(int i = 2; i <= number; i++){
            int c = a + b;
            System.out.println(" " + c);
            a = b;
            b = c;
        }

        System.out.println("Tabeed Hameed | CSE-20-07");
        ins.close();
    }
}
