package string;

import java.util.Arrays;

/**
 * @FileName: ReverseWordsinaString151
 * @Description: Given an input string s, reverse the order of the words.
 * <p>
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at
 * least one space.
 * <p>
 * Return a string of the words in reverse order concatenated by a single space.
 * <p>
 * Note that s may contain leading or trailing spaces or multiple spaces between two words. The
 * returned string should only have a single space separating the words. Do not include any extra
 * spaces.
 * @Author: Spencer ZHAO
 * @Date: 8/3/2023
 */
public class ReverseWordsinaString151 {
    
    public String reverseWords(String s) {
        // remove blank
        char[] charArray = s.toCharArray();
        int size = charArray.length;
        int slow;
        int fast;
        for (fast = 0, slow = 0; fast < size; fast++) {
            if (charArray[fast] != ' ') {
                if (slow != 0) {
                    charArray[slow] = ' ';
                    slow++;
                }
                while (fast < size && charArray[fast] != ' ') {
                    charArray[slow] = charArray[fast];
                    slow++;
                    fast++;
                }
            }
        }
        
        // take the first SLOW part of the array
        charArray = Arrays.copyOf(charArray, slow);
        
        // update size of the array
        size = slow;
        
        // reverse all
        reverse(0, size - 1, charArray);
        
        // reverse letter in words
        slow = 0;
        fast = 0;
        while (fast < size && slow < size) {
            while (fast < size && charArray[fast] != ' ') {
                fast++;
            }
            if (fast == size - 1) {
                reverse(slow, fast, charArray);
            } else {
                reverse(slow, fast - 1, charArray);
                slow = fast;
            }
            fast++;
            slow++;
        }
        return new String(charArray);
    }
    
    
    public void reverse(int start, int stop, char[] s) {
        while (start < stop) {
            swap(start, stop, s);
            start++;
            stop--;
        }
    }
    
    private void swap(int i, int j, char[] s) {
        char tmp = s[i];
        s[i] = s[j];
        s[j] = tmp;
    }
    
}
