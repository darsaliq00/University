import java.util.Scanner;

public class library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days the book is late: ");
        int daysLate = scanner.nextInt();

        double fine = 0;

        if (daysLate <= 5) {
            fine = daysLate * 0.5;
        } else if (daysLate <= 10) {
            fine = 5 * 0.5 + (daysLate - 5) * 1;
        } else if (daysLate <= 30) {
            fine = 5 * 0.5 + 5 * 1 + (daysLate - 10) * 5;
        } else {
            System.out.println("Your membership has been cancelled due to returning the book after 30 days.");
            scanner.close();
            return;
        }

        System.out.printf("The fine for returning the book %d days late is Rs. %.2f\n", daysLate, fine);

           }
}
