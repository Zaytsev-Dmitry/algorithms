package removeDuplicatesFromSortedArray;

public class Solution {
    public static void main(String[] args) {
        int i = removeDuplicates(new int[]{1, 1, 2});
        System.out.println(i);
    }

    public static int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((i + 1) <= (nums.length - 1)) {
                if (nums[i] != nums[i + 1]) {
                    nums[k] = nums[i];
                    k++;
                }
            } else {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
