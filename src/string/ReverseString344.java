package string;

/**
 * @FileName: ReverseString344
 * @Description: Write a function that reverses a string. The input string is given as an array of
 * characters s. You must do this by modifying the input array in-place with O(1) extra memory.
 * @Author: Spencer ZHAO
 * @Date: 8/3/2023
 */
public class ReverseString344 {
    
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
    }
}
