package algo.q_26;

/**
 * @author likun 2019/5/1610:28 AM
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i ++;
                nums[i] = nums[j];
            }

        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 2, 3, 3, 4, 4, 5, 5, 6};
        Solution solution = new Solution();

        int index = solution.removeDuplicates(nums);
        for (int i = 0; i < index; i++) {
            System.out.print(nums[i] + ",");
        }
    }
}
