package Leetcode.data_structures.arrays.move_zeros;

public class MoveZeros {
    int lastNonZeroFoundAt = 0;
  public void moveZeros(int[] nums) {
      for(int current = 0; current<nums.length; current++) {
            if(nums[current] != 0) {
                int temp = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = nums[current];
                nums[current] =  temp;

                lastNonZeroFoundAt ++;
            }
      }
  }

  public static void main(String[] args) {
      int[] nums1 = {0, 1, 0, 3, 12};
      MoveZeros moveZeros1 = new MoveZeros();
      moveZeros1.moveZeros(nums1);
      System.out.println(java.util.Arrays.toString(nums1));
  }
}
