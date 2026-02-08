class Solution {
    static int makeEqual(int[] arr, int k) {
        int rem = arr[0] % k;
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % k != rem)
                return -1;
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        return (max - min) / k;
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 19, 16};
        int k = 3;

        int result = makeEqual(arr, k);
        System.out.println(result); 
    }
}
