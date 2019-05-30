package algo.q_58;

/**
 * @author likun 2019/5/2010:40 AM
 */
public class Solution {
    public int lengthOfLastWord(String s) {
        if (null == s || "".equals(s.trim())) {
            return 0;
        }
        char[] array = s.toCharArray();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (count == 0 && ' ' == array[i]) {
            } else if (' ' == array[i]) {
                break;
            } else {
                count ++;
            }
        }

        return count;
    }
}
