package findIndexFirstOccurrenceString;

public class Solution {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle));
    }


    public static int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }

        for (int i = 0; i < haystack.length(); i++) {
            String substring = haystack.substring(i, needle.length() + i);
            if (needle.equalsIgnoreCase(substring)) {
                return i;
            }

            if (substring.length() + i  == haystack.length()) {
                return -1;
            }
        }
        return -1;
    }
}
