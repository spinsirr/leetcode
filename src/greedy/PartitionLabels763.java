package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 10/25/2023-12:48 PM
 */
public class PartitionLabels763 {
    
    public List<Integer> partitionLabels(String s) {
        int[] hash = new int[26];
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a'] = i;
        }
        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            right = Math.max(hash[s.charAt(i) - 'a'], right);
            if (i == right) {
                right++;
                result.add(right - left);
                left = right;
            }
        }
        return result;
    }
}
