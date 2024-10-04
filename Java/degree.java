import java.util.Scanner;

public class degree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks in subject A (out of 100): ");
        double marksA = scanner.nextDouble();

        System.out.print("Enter marks in subject B (out of 100): ");
        double marksB = scanner.nextDouble();

         double percentA = marksA;
        double percentB = marksB;

        if (percentA >= 55 && percentB >= 45) {
            System.out.println("The student has passed.");
        } else if (percentA >= 45 && percentA < 55 && percentB >= 55) {
            System.out.println("The student has passed.");
        } else if (percentA >= 65 && percentB < 45) {
            System.out.println("The student is allowed to reappear in examination B.");
        } else {
            System.out.println("The student has failed.");
        }

          }
}
