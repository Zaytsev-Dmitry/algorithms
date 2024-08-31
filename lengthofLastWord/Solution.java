package lengthofLastWord;

public class Solution {
    public static void main(String[] args) {
        String s = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
        System.out.println(lengthOfLastWord(s2));
        System.out.println(lengthOfLastWord(s3));
    }

    public static int lengthOfLastWord(String s) {
        int index = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                index++;
            } else if (index != 0) {
                break;
            }
        }
        return index;
    }
}
