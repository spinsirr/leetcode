package greedy;

import java.util.Arrays;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 10/19/2023-11:03 PM
 */
public class AssignCookies455 {
    
    
    public int findContentChildren(int[] g, int[] s) {
        if (s.length == 0) {
            return 0;
        }
        Arrays.sort(s);
        Arrays.sort(g);
        int index = 0;
        for (int j : s) {
            if (index < g.length && g[index] <= j) {
                index++;
            }
        }
        return index;
    }
}
