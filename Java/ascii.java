import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
          
      Scanner scanner = new Scanner(System.in);
      System.out.print("identifies number, charater,  letters both upper and lower case for you, just in case you are unable to fuking read it from keyboard or have an alien one using same system but different presentation , without the print");  
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        if (ch >= 65 && ch <= 90) {
            System.out.println("The character is a capital letter.");
        } else if (ch >= 97 && ch <= 122) {
            System.out.println("The character is a small case letter.");
        } else if (ch >= 48 && ch <= 57) {
            System.out.println("The character is a digit.");
        } else if ((ch >= 0 && ch <= 47) || (ch >= 58 && ch <= 64) || 
                   (ch >= 91 && ch <= 96) || (ch >= 123 && ch <= 127)) {
            System.out.println("The character is a special symbol.");
        } else {
            System.out.println("The character is not an ASCII character.");
        }
        
           }
}
