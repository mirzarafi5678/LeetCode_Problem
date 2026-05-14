import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] {};
    }
}
class Main {
    public static void main(String[] args) {
        Solution ss = new Solution();

        int[] result = ss.twoSum(new int[]{1, 3, 2, 1}, 3);
        System.out.println(Arrays.toString(result));
    }

}