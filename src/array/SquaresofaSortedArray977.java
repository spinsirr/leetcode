package array;

/**
 * @FileName: arrays.SquaresofaSortedArray977
 * @Description: Given an integer array nums sorted in non-decreasing order, return an array of the
 * squares of each number sorted in non-decreasing order.
 * @Author: Spencer ZHAO
 * @Date: 7/22/2023
 */
public class SquaresofaSortedArray977 {
    
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int index = nums.length - 1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right && index >= 0) {
            int leftRes = (int) Math.pow(nums[left], 2);
            int rightRes = (int) Math.pow(nums[right], 2);
            if (leftRes > rightRes) {
                res[index] = leftRes;
                left++;
            } else {
                res[index] = rightRes;
                right--;
            }
            index--;
        }
        return res;
    }
}
