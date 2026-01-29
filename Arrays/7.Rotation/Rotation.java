class Rotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int d = 2;
        int n = arr.length;
        // Repeat the rotation d times
        for (int i = 0; i < d; i++) {
            // Right rotate the array by one position
            int last = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }

        for (int x : arr)
            System.out.print(x + " ");
    }
}
