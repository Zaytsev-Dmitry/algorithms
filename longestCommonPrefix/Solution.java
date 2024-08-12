package longestCommonPrefix;

public class Solution {
    public static void main(String[] args) {
        String s_1 = longestCommonPrefix(new String[]{"reflower","flow","flight"});
        String s_2 = longestCommonPrefix(new String[]{"dog", "racecar", "car"});
        String s_3 = longestCommonPrefix(new String[]{"flower", "flow", "fpfdf"});
        String s_4 = longestCommonPrefix(new String[]{"dog", "racecar", "car"});
        System.out.println(s_1);
        System.out.println(s_2);
        System.out.println(s_3);
        System.out.println(s_4);
    }


    public static String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        String second = strs[strs.length - 1];
        int index = 0;
        while (index < first.length() && index < second.length()) {
            if (first.charAt(index) == second.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        return first.substring(0, index);
    }
}
