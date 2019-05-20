package algo.q_38;

/**
 * @author likun 2019/5/166:28 PM
 */
public class Solution {
    public String countAndSay(int n) {

        if (n == 1) {
            return "1";
        }

        String word = countAndSay(n - 1);
        StringBuilder res = new StringBuilder();
        int count = 1;
        char[] array = word.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                res.append(count).append(array[i]);
            } else {
                if (array[i] == array[i + 1]) {
                    count++;
                } else {
                    res.append(count).append(array[i]);
                    count = 1;
                }
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countAndSay(1));
        System.out.println(solution.countAndSay(2));
        System.out.println(solution.countAndSay(3));
        System.out.println(solution.countAndSay(4));
        System.out.println(solution.countAndSay(5));
    }

}
