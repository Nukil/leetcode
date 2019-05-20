package algo.q_14;

import java.util.HashMap;
import java.util.Map;

/**
 * @author likun 2019/5/155:35 PM
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            if (prefix.isEmpty()) {
                return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        System.out.println("aaaa".indexOf("aab"));
    }
}
