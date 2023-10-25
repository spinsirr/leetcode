package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 10/23/2023-9:24 PM
 */
public class QueueReconstructionbyHeight406 {
    
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return b[0] - a[0];
        });
        
        LinkedList<int[]> que = new LinkedList<>();
        
        for (int[] p : people) {
            que.add(p[1], p);
        }
        return que.toArray(new int[people.length][2]);
    }
}
