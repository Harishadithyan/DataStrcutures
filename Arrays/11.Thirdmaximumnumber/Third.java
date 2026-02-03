import java.util.*;

class Third {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 1};
        Arrays.sort(nums);
        int count = 1; 
        int max = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != nums[i + 1]) {
                count++;
                if (count == 3) {
                    System.out.println(nums[i]);
                    return;
                }
            }
        }
        System.out.println(max);
    }
}
