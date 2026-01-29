class check {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        boolean isSorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted)
            System.out.println("Sorted");
        else
            System.out.println("Not Sorted");
    }
}
