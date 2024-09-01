package TopKFrequentElements;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(topKFrequent(new int[]{4,1,-1,2,-1,2,3}, 2));
        System.out.println(topKFrequent(new int[]{1}, 1));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(countMap.keySet());
        list.sort((a, b) -> countMap.get(b) - countMap.get(a));

        for (int i = 0; i < k; ++i) {
            result[i] = list.get(i);
        }
        return result;
    }
}
