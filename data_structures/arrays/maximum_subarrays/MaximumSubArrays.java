package data_structures.arrays.maximum_subarrays;

public class MaximumSubArrays {
    public int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;

        for (int num : nums) {
            current_sum += num;

            if (current_sum > max_sum) {
                max_sum = current_sum;
            }

            if (current_sum < 0) {
                current_sum = 0;
            }
        }
        return max_sum;
    }

    public static void main(String[] args) {
        MaximumSubArrays solution = new MaximumSubArrays();
        int[] nums1 = {5, 4, -1, 7, 8};
        System.out.println("Max Subarray Sum: " + solution.maxSubArray(nums1));
    }
}