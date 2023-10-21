package greedy;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 10/21/2023-12:34 AM
 */
public class JumpGameII45 {
    
    public int jump(int[] nums) {
        int index;
        int cover = 0;
        if (nums.length <= 1) {
            return 0;
        }
        for (index = 0; index <= cover; index++) {
            cover = Math.max(cover, nums[index] + index);
            if (cover >= nums.length - 2) {
                break;
            }
        }
        return index + 1;
    }
}
