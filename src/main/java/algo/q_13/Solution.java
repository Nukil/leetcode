package algo.q_13;

import java.util.HashMap;
import java.util.Map;

/**
 * @author likun 2019/5/155:35 PM
 */
public class Solution {
    private Map<Character, Integer> map = new HashMap<>();
    {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int romanToInt(String s) {
        char[] array = s.toCharArray();
        int res = map.get(array[array.length - 1]);
        for (int i = 0; i < array.length - 1; i ++) {
            res = cal(array[i], array[i + 1], res);
        }
        return res;
    }

    private int cal(Character c1, Character c2, int res) {
        int num1 = map.get(c1);
        int num2 = map.get(c2);
        int total = num1 + num2;
        if (num1 < num2 && (total % 6 == 0 || total % 11 == 0)) {
            res -= num1;
        } else {
            res += num1;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("III"));
        System.out.println(solution.romanToInt("VII"));
        System.out.println(solution.romanToInt("MII"));
    }
}
