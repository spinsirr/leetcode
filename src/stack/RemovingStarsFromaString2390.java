package stack;

/**
 * @FileName: RemovingStarsFromaString2390
 * @Description: TODO
 * @Author: Spencer ZHAO
 * @Date: 8/14/2023
 */
public class RemovingStarsFromaString2390 {
    
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        int top = -1;
        for (char ch : s.toCharArray()) {
            if (sb.isEmpty() || ch != '*') {
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
