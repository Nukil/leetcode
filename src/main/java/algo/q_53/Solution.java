package algo.q_53;

/**
 * @author likun 2019/5/175:11 PM
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0)
                sum += num;
            else
                sum = num;
            res = Math.max(res, sum);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        int[] array1 = {-1,-2,-3,-4,-5};
        int[] array2 = {-2,1};
        System.out.println(solution.maxSubArray(array));
        System.out.println(solution.maxSubArray(array1));
        System.out.println(solution.maxSubArray(array2));
    }
}
