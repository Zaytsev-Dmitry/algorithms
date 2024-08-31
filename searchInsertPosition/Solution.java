package searchInsertPosition;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 0;
        System.out.println(searchInsert(nums, target));
        System.out.println(searchInsert2(nums, target));
        System.out.println(searchInsert3(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if (curr > target || curr == target) {
                return i;
            } else if (nums.length - 1 == i) {
                return i + 1;
            }
        }
        return index;
    }

    public static int searchInsert2(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
