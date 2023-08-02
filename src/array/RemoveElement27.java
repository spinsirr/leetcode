package array;

/**
 * @FileName: arrays.RemoveElement27
 * @Description: Given an integer array nums and an integer val, remove all occurrences of val in
 * nums in-place. The order of the elements may be changed. Then return the number of elements in
 * nums which are not equal to val. Consider the number of elements in nums which are not equal to
 * val be k, to get accepted, you need to do the following things: Change the array nums such that
 * the first k elements of nums contain the elements which are not equal to val. The remaining
 * elements of nums are not important as well as the size of nums. Return k.
 * @Author: Spencer ZHAO
 * @Date: 7/21/2023
 */
public class RemoveElement27 {
    
    public int removeElement(int[] nums, int val) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
