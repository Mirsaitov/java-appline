public class Task15 {
    public static void main(String[] args) {
        int[] nums = {91, 22, 41, 52, 34, 15, 0, 72, 35, 8};
        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }
        for (int q = 0; q < nums.length; q++)
        System.out.println(nums[q]);
    }
}
