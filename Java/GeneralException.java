

import java.util.Scanner;

public class GeneralException {
    public static void main(String[] args) {
        Scanner ins = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int a = ins.nextInt();
        System.out.println("Enter Number 2: ");
        int b = ins.nextInt();

        try{
            int c  = a/ b;
            System.out.println("Result: " + c);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
