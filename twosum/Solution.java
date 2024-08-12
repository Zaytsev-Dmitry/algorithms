package twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] target_9 = twoSum2(new int[]{2, 7, 11, 15}, 9);
        int[] target_6 = twoSum(new int[]{2,5,5,11}, 10);
        int[] target_6_2 = twoSum(new int[]{3, 3}, 6);

        System.out.println(Arrays.toString(Arrays.stream(target_9).toArray()));
        System.out.println(Arrays.toString(Arrays.stream(target_6).toArray()));
        System.out.println(Arrays.toString(Arrays.stream(target_6_2).toArray()));
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0;; ++i) {
            int x = nums[i];
            int y = target - x;
            if (m.containsKey(y)) {
                return new int[] {m.get(y), i};
            }
            m.put(x, i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int first = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int second = nums[j];
                if ((first + second) == target) {
                    return new int[]{i, j};
                }
                if ((j + 1) == (nums.length)) {
                    break;
                }
            }
        }
        return new int[]{};
    }
}
