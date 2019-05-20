package algo.q_27;

/**
 * @author likun 2019/5/163:19 PM
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i ++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 2, 3, 3, 4, 4, 5, 5, 6};
        Solution solution = new Solution();

        int index = solution.removeElement(nums, 3);
        for (int i = 0; i < index; i++) {
            System.out.print(nums[i] + ",");
        }
    }

}
