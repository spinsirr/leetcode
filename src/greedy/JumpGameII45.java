package greedy;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 10/21/2023-12:34 AM
 */
public class JumpGameII45 {
    
    public int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int currJump = 0;
        int nextJump = 0;
        int step = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            nextJump = Math.max(nums[i] + i, nextJump);
            if (i == currJump) {
                currJump = nextJump;
                step++;
            }
        }
        return step;
    }
}
