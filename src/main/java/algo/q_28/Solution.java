package algo.q_28;

/**
 * @author likun 2019/5/163:31 PM
 */
public class Solution {
    public int strStr(String haystack, String needle) {

        if (needle.length() > haystack.length()) {
            return -1;
        }

        if ("".equals(needle.trim())) {
            return 0;
        }

        char[] charArray1 = haystack.toCharArray();
        char[] charArray2 = needle.toCharArray();
        int i = 0;
        int j = 0;
        while (i < charArray1.length && j < charArray2.length) {
            if (charArray1[i] == charArray2[j]) {
                i ++;
                j ++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }

        if (j == charArray2.length) {
            return i - j;
        } else {
            return -1;
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.strStr("hello", "ll"));
        System.out.println(solution.strStr("aaaaa", "bba"));
    }
}
