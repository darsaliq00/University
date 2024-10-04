

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner ins = new Scanner(System.in);
        double a, b, c, disc, root1, root2;

        System.out.println("Solving for ax^2 + bx + c");
        System.out.println("Enter Coefficient of \'a\'");
        a = ins.nextDouble();
        System.out.println("Enter Coefficient of \'b\'");
        b = ins.nextDouble();
        System.out.println("Enter Coefficient of \'c\'");
        c = ins.nextDouble();

        disc = (b * b) - (4 * a * c);

        if(disc > 0){
            root1 = (-b + Math.sqrt(disc))/ ( 2 * a);
            root2 = (-b - Math.sqrt(disc))/ ( 2 * a);

            System.out.println("The Roots are Real and Distinct.\nRoots are: " + root1 + " & " + root2);
        }else if(disc == 0){
            root1 = root2 = -b / (2 * a);
            System.out.println("The Roots are equal. \nRoots are: " + root1 + " & " + root2);
        }else{
            System.out.println("The Roots are Imaginary!");
        }

        System.out.println("Tabeed Hameed | CSE-20-07");
        ins.close();

    }
}
