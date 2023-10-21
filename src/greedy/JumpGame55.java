package greedy;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 10/21/2023-12:18 AM
 */
public class JumpGame55 {
    
    public boolean canJump(int[] nums) {
        int range = 0;
        for (int i = 0; i <= range; i++) {
            range = Math.max(range, nums[i] + i);
            if (range >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}
