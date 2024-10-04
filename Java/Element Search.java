import java.util.Scanner;
class Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter elements of array: ");
        int i;
        for(i=0;i<5;i++)
        {
            arr[i]=  sc.nextInt();
        }
        System.out.println("Enter element to search: ");
        int num = sc.nextInt();
        for(i=0;i<5;i++)
        {
            if(arr[i]==num)
                System.out.println("Enter found at index: "+i);
        }
        
    }
}