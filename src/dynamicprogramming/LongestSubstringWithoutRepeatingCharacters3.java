package dynamicprogramming;

import java.util.HashSet;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 12/1/2023-1:37 AM
 */
public class LongestSubstringWithoutRepeatingCharacters3 {
    
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        char[] charArr = s.toCharArray();
        HashSet<Character> chSet = new HashSet<>();
        for (int right = 0; right < charArr.length; right++) {
            if (!chSet.contains(charArr[right])) {
                chSet.add(charArr[right]);
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (chSet.contains(charArr[right])) {
                    chSet.remove(charArr[left]);
                    left++;
                }
                chSet.add(charArr[right]);
            }
        }
        return maxLength;
    }
}
