import java.util.*;

class Leaders {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;

        // Start with the rightmost element
        int maxRight = arr[n - 1];

        // Rightmost element is always a leader
        result.add(maxRight);

        // Traverse the array from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                maxRight = arr[i];
                result.add(maxRight);
            }
        }

        // Reverse the result list to maintain
        // original order
        Collections.reverse(result);

        System.out.println(result);
    }
}
