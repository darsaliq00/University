package CSE355C;



import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner ins = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = ins.nextInt();

        int fact = 1;
        for(int i = number; i > 0; i--)
            fact = fact * i;
        
        System.out.println("Factorial of " + number + " is: " + fact);
        System.out.println("Tabeed Hameed | CSE-20-07");

        ins.close();
    }
}
