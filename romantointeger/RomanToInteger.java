package romantointeger;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        //output == 3
        int iii = romanToInt("III");
        if (iii != 3) {
            throw new IllegalArgumentException("неверно. Должно быть 3");
        }
        //output == 58
        int lviii = romanToInt("LVIII");
        if (lviii != 58) {
            throw new IllegalArgumentException("неверно. Должно быть 58");
        }
        //output == 1994
        int mcmxciv = romanToInt("MCMXCIV");
        if (mcmxciv != 1994) {
            throw new IllegalArgumentException("неверно. Должно быть 1994");
        }

        System.out.println("Задача решена верно");
    }

    private static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        if (s.length() == 1) {
            result = map.get(s.charAt(0));
        } else {
            for (int i = 0; i < s.length() - 1; i++) {
                char curr = s.charAt(i);
                char next = s.charAt(i + 1);
                if (curr == 'I' && (next == 'V' || next == 'X') || curr == 'X' && (next == 'L' || next == 'C') || curr == 'C' && (next == 'D' || next == 'M')) {
                    result = result + (map.get(next) - map.get(curr));
                    i++;
                } else {
                    result = result + map.get(curr);
                }

                if (i + 1 == s.length() - 1) {
                    result = result + map.get(s.charAt(s.length() - 1));
                }
            }
        }

        return result;
    }
}
