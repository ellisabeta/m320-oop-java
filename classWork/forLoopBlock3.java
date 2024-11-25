package classWork;

public class forLoopBlock3 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int target = 5;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result = nums[i] + nums[j];
                }
            }
        }
    }
}
