package hashtable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * @FileName: IntersectionofTwoArrays349
 * @Description: Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must be unique and you may return the result in any order.
 * @Author: Spencer ZHAO
 * @Date: 8/1/2023
 */
public class IntersectionofTwoArrays349 {
    
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> resSet = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            if (set.contains(num)) {
                resSet.add(num);
            }
        }
        int count = resSet.size();
        int[] res = new int[count];
        int i = 0;
        for (int num : resSet) {
            res[i] = num;
            i++;
        }
        return res;
    }
}
