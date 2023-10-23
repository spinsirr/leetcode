package greedy;

import java.util.Arrays;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 10/21/2023-1:56 PM
 */
public class GasStation134 {
    
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curSum = 0;
        int ttlSum = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            curSum += gas[i] - cost[i];
            ttlSum += gas[i] - cost[i];
            if (curSum < 0) {
                start = i + 1;
                curSum = 0;
            }
        }
        if (ttlSum < 0) {
            return -1;
        }
        return start;
    }
}
