

import java.util.Scanner;

public class Replacer {
    public static void main(String[] args) {
        Scanner ins = new Scanner(System.in);
        System.out.println("Enter String: ");
        String input = ins.nextLine();
        String modded = input.replace(" ", "_");
        System.out.println("Modified String: " + modded);
        System.out.println("\n\nTabeed Hameed | CSE-20-07");
    }
}
