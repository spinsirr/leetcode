package string;

/**
 * @FileName: FindtheIndexoftheFirstOccurrenceinaString28
 * @Description: TODO
 * @Author: Spencer ZHAO
 * @Date: 8/10/2023
 */
public class FindtheIndexoftheFirstOccurrenceinaString28 {
    
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        int[] next = new int[needle.length()];
        getNext(next, needle);
        
        int j = 0;
        for (int i = 0; i < haystack.length(); i++) {
            while (j > 0 && needle.charAt(j) != haystack.charAt(i)) {
                j = next[j - 1];
            }
            if (needle.charAt(j) == haystack.charAt(i)) {
                j++;
            }
            if (j == needle.length()) {
                return i - needle.length() + 1;
            }
        }
        return -1;
    }
    
    private void getNext(int[] next, String s) {
        char[] chars = s.toCharArray();
        int j = 0;
        next[0] = 0;
        for (int i = 1; i < chars.length; i++) {
            while (j > 0 && chars[j] != chars[i]) {
                j = next[j - 1];
            }
            if (chars[j] == chars[i]) {
                j++;
            }
            next[i] = j;
        }
    }
}
