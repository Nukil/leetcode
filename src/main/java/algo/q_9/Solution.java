package algo.q_9;

/**
 * @author likun 2019/5/154:58 PM
 */
class Solution {
    public boolean isPalindrome(int x) {
        // 特殊情况：
        // 如上所述，当 x < 0 时，x 不是回文数。
        // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
        // 则其第一位数字也应该是 0
        // 只有 0 满足这一属性
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertNum = 0;
        while (x > revertNum) {
            revertNum = revertNum * 10 + (x % 10);
            x /= 10;
        }
        return revertNum == x || revertNum / 10 == x;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(123));
        System.out.println(solution.isPalindrome(121));
    }
}