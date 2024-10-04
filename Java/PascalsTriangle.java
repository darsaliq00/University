package CSE355C;



import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner ins = new Scanner(System.in);
        System.out.println("Enter Rows: ");
        int rows = ins.nextInt();

        int n = 1;

        for(int i = 0; i < rows; i++){
            for(int space = 1; space  <= rows - i; space++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                if(j == 0 || i == 0){
                    n = 1;
                }else{
                    n = n * (i - j + 1) / j;
                }
                System.out.print(" "+ n);
            }

            System.out.println(" ");
        }

        ins.close();
    }
}
