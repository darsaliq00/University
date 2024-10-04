package CSE355C;



import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        int n = 1;
        Scanner ins = new Scanner(System.in);
        System.out.println("Enter number of Rows: ");
        int rows = ins.nextInt();

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(n + " ");
            }
            System.out.println("");
        }

        System.out.println("Tabeed Hameed | CSE-20-07");
        ins.close();
    }
}
