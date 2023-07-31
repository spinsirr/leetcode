package hashtable;

import java.util.Arrays;
import java.util.Objects;

/**
 * @FileName: ValidAnagram242
 * @Description: Given two strings s and t, return true if t is an anagram of s, and false
 * otherwise. An Anagram is a word or phrase formed by rearranging the letters of a different word
 * or phrase, typically using all the original letters exactly once.
 * @Author: Spencer ZHAO
 * @Date: 8/1/2023
 */
public class ValidAnagram242 {
    
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        int[] table = new int[26];
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        for (char value1 : sArray) {
            table[value1 - 'a']++;
        }
        for (char value2 : tArray) {
            table[value2 - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (table[i] != 0){
                return false;
            }
        }
        return true;
    }
}
