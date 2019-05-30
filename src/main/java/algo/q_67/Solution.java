package algo.q_67;

/**
 * @author likun 2019/5/204:43 PM
 */
public class Solution {
    public String addBinary(String a, String b) {
        if (b.length() > a.length()) {
            String tmp = a;
            a = b;
            b = tmp;
        }

        char[] array1 = a.toCharArray();
        char[] array2 = b.toCharArray();

        int i = array1.length, j = array2.length;
        char pop = '0';
        while (i -- > 0 || j -- > 0) {
            if (array1[i] == array2[i] && array1[j] == '1' && pop == '1') {
                array1[i] = '1';
                pop = '1';
            } else if (array1[i] == array2[i] && array1[j] == '1' && pop == '0') {
                array1[i] = '0';
                pop = '1';
            } else if ((array1[i] == '1' || array2[j] == '1') && pop == '1') {
                array1[i] = '0';
                pop =
            }
        }


    }
}
