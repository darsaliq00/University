class Arr2 {
    public static void main(String args[]) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        int[] sumArr = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            sumArr[i] = arr1[i] + arr2[i];
        }

        System.out.println("Array 1: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println("\nArray 2: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println("\nSum of arrays: ");
        for (int num : sumArr) {
            System.out.print(num + " ");
        }

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("\n\n2D Array:");
        for (int[] row : arr2D) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
