package arrays;

/**
 * @FileName: BinarySearch
 * @Description: Given an array of integers nums which is sorted in ascending order, and an integer
 * target, write a function to search target in nums. If target exists, then return its index.
 * Otherwise, return -1.
 * @Author: Spencer ZHAO
 * @Date: 7/21/2023
 */
public class BinarySearch704 {
    public int search(int[] nums, int target) {
        int middle;
        int left = 0;
        int right = nums.length;
        while (left < right){
            middle = (left + right) / 2;
            if (nums[middle] > target){
                right = middle;
            } else if(nums[middle] < target){
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
