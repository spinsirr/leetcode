package arrays;

import java.util.Arrays;

/**
 * @FileName: arrays.SpiralMatrixII59
 * @Description: TODO
 * @Author: Spencer ZHAO
 * @Date: 7/24/2023
 */
public class SpiralMatrixII59 {
    
    public static int[][] generateMatrix(int n) {
        int[][] nums = new int[n][n];
        int up = 0;
        int down = n - 1;
        int left = 0;
        int right = n - 1;
        int count = 1;
        int target = n * n;
        int i, j;
        while (count <= target) {
            for (j = left; j <= right; j++) {
                nums[up][j] = count++;
            }
            up++;
            for (i = up; i <= down; i++) {
                nums[i][right] = count++;
            }
            right--;
            for (j = right; j >= left; j--) {
                nums[down][j] = count++;
            }
            down--;
            for (i = down; i >= up; i--) {
                nums[i][left] = count++;
            }
            left++;
        }
        return nums;
    }
}
