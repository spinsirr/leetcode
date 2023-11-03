package dynamicprogramming;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 11/3/2023-12:30 AM
 */
public class ClimbingStairs70 {
    
    public int climbStairs(int n) {
        if (n == 0) {
            return 0;
        }
        int[] climb = new int[2];
        climb[1] = 1;
        for (int i = 0; i < n; i++) {
            int sum = climb[0] + climb[1];
            climb[0] = climb[1];
            climb[1] = sum;
        }
        return climb[1];
    }
}
