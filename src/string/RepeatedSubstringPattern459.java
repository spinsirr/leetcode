package string;

import java.util.Arrays;

/**
 * @FileName: RepeatedSubstringPattern459
 * @Description: TODO
 * @Author: Spencer ZHAO
 * @Date: 8/9/2023
 */
public class RepeatedSubstringPattern459 {
    
    public boolean repeatedSubstringPattern(String s) {
        if (s.isEmpty()) {
            return false;
        }
        
        int len = s.length();
        
        s = " " + s;
        char[] chars = s.toCharArray();
        int[] next = new int[len + 1];
        
        for (int i = 2, j = 0; i <= len; i++) {
            while (j > 0 && chars[i] != chars[j + 1]) {
                j = next[j];
            }
            if (chars[i] == chars[j + 1]) {
                j++;
            }
            next[i] = j;
        }
        System.out.println(Arrays.toString(next));
        return next[len] > 0 && len % (len - next[len]) == 0;
    }
    
}
