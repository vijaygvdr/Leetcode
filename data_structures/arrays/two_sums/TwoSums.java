package Leetcode.data_structures.arrays.two_sums;

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class TwoSums {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> numToIndex = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];

                if(numToIndex.containsKey(complement)) {
                    return new int[] {numToIndex.get(complement),i};
                }
                numToIndex.put(nums[i],i);
            }
            throw new IllegalArgumentException("No two sum solution");
        }

        public static void main(String[] args) {
            TwoSums twoSums = new TwoSums();
            int[] output1 = twoSums.twoSum(new int[]{2,7,11,15},9);
            System.out.println(Arrays.toString(output1));
        }
}
