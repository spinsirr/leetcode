package stack;

/**
 * @FileName: RemoveAllAdjacentDuplicatesInString1047
 * @Description: TODO
 * @Author: Spencer ZHAO
 * @Date: 8/14/2023
 */
public class RemoveAllAdjacentDuplicatesInString1047 {
    
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        int top = -1;
        for (char ch : s.toCharArray()) {
            if (sb.isEmpty() || sb.charAt(top) != ch) {
                sb.append(ch);
                top++;
            } else {
                sb.deleteCharAt(top);
                top--;
            }
        }
        return sb.toString();
    }
}
