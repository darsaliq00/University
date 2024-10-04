import java.util.Scanner;
 class compare {
    
    public static void main(String[] args)
    {int n1,n2;
        Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Two Numbers : ");
    n1 = scanner.nextInt();
    n2 = scanner.nextInt();
if(n1<n2)
{System.out.print("n1 is smaller");
}
else
{System.out.print("n2 is smaller");
}
}
}
