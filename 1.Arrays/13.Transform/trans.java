class trans {

    public static int[] transform(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {

            if (arr[i] > 0) {
                int idx = (i + arr[i]) % n;
                res[i] = arr[idx];

            } else if (arr[i] < 0) {
                int idx = (i + arr[i]) % n;
                if (idx < 0) idx += n;   
                res[i] = arr[idx];

            } else {
                res[i] = arr[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 0, 3};
        int[] result = transform(arr);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
