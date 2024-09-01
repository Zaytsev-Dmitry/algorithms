package plusOne;

public class Solution {
    public static void main(String[] args) {
        boolean palindrome_1 = isPalindrome(111);
        boolean palindrome_2 = isPalindrome(123);
        System.out.println(palindrome_1);
        System.out.println(palindrome_2);
    }

    public static boolean isPalindrome(int x) {
        String source = String.valueOf(x);
        StringBuilder reserved = new StringBuilder();

        for (int i = source.toCharArray().length - 1; i >= 0; i--) {
            reserved.append(source.charAt(i));
        }

        return source.equalsIgnoreCase(reserved.toString());
    }
}
