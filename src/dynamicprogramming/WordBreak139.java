package dynamicprogramming;

import java.util.HashSet;
import java.util.List;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 11/26/2023-12:50 AM
 */
public class WordBreak139 {
    
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> wordSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length() && !dp[i]; i++) {
            for (int j = 0; j < i; j++) {
                String str = s.substring(j, i);
                if (wordSet.contains(str) && dp[j]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
