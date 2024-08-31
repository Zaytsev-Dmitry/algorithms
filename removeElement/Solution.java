package removeElement;

import static java.util.Arrays.sort;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 2, 3};
        int val = 3;
        int k = removeElement(nums, val);
        System.out.println(k);
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
