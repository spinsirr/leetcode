package string;

import java.util.Arrays;

/**
 * @FileName: ReverseStringII541
 * @Description: Given a string s and an integer k, reverse the first k characters for every 2k
 * characters counting from the start of the string. If there are fewer than k characters left,
 * reverse all of them. If there are less than 2k but greater than or equal to k characters, then
 * reverse the first k characters and leave the other as original.
 * @Author: Spencer ZHAO
 * @Date: 8/3/2023
 */
public class ReverseStringII541 {
    
    public String reverseStr(String s, int k) {
        char[] charArray = s.toCharArray();
        int size = charArray.length;
        for (int i = 0; i < size; i += 2 * k) {
            if (i + k - 1 >= size) {
                reverse(charArray, i, size - 1);
            } else {
                reverse(charArray, i, i + k - 1);
            }
        }
        return new String(charArray);
    }
    
    public void reverse(char[] charArray, int start, int end) {
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
    }
}
