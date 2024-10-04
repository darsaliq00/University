class Arr1 {
    public static void main(String args[]) {
        int[] abc = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        
        System.out.println("The fourth element is: " + abc[3]); 
        abc[9]=50;
       
        System.out.println("Array elements:");
        for (int i = 0; i < abc.length; i++) {
            System.out.print(abc[i] + " ");

        }

       int max = abc[0];
        for (int num : abc) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("The greatest number in the array is: " + max);
    
}
}
