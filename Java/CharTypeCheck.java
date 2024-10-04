import java.util.Scanner;

public class CharacterTypeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        int ascii = (int) ch;

        if (ascii >= 65 && ascii <= 90) {
            System.out.println(ch + " is a capital letter.");
        } else if (ascii >= 97 && ascii <= 122) {
            System.out.println(ch + " is a small letter.");
        } else if (ascii >= 48 && ascii <= 57) {
            System.out.println(ch + " is a digit.");
        } else if ((ascii >= 0 && ascii <= 47) || 
                   (ascii >= 58 && ascii <= 64) || 
                   (ascii >= 91 && ascii <= 96) || 
                   (ascii >= 123 && ascii <= 127)) {
            System.out.println(ch + " is a special symbol.");
        } else {
            System.out.println("Unknown character type.");
        }
        
        scanner.close();
    }
}
