package algo.q_66;

/**
 * @author likun 2019/5/203:32 PM
 */
public class Solution {
    public int[] plusOne(int[] digits) {

        int pop = 1;
        int i = digits.length - 1;
        do {
            digits[i] += pop;
            pop = digits[i] / 10;
            digits[i] = digits[i] % 10;
            i --;
        } while (pop != 0 && i >= 0);

        if (pop != 0 && i == -1) {
            int[] res = new int[digits.length + 1];
            System.arraycopy(digits, 0, res, 1, digits.length);
            res[0] = pop;
            digits = res;
        }

        return digits;
    }

    public static void main(String[] args) {
        int[] array = {8,9,9,9};
        Solution solution = new Solution();
        int[] res = solution.plusOne(array);
        int[] res1 = solution.plusOne(array);
        int[] res2 = solution.plusOne(array);
    }
}
