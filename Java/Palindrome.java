

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner ins = new Scanner(System.in);
        String input = ins.next();
        String rev = "";

        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            rev += c;
        }

        if(input.equals(rev))
            System.out.println("String is Palindrome");
        else
            System.out.println("String is Not Palindrome");

        ins.close();
    }
}
