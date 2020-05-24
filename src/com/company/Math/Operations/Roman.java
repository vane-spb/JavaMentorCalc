/*

Only for 1 to 10, sorry
100 for output needed
hate this numbers a bit

 */

package com.company.Math.Operations;

import java.util.TreeMap;

public class Roman {
    private final static TreeMap<Integer, String> map = new TreeMap<>();
    static String[] romanians = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    static {

        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }

    public static Integer romanToInt(String string) {
        for (int i = 0; i < 10; i++) {
            if (romanians[i].equals(string)) {
                return i + 1;
            }
        }
        return null;
    }

    //it's an adapter for romaniser algorithm to deal with 0 and above
    public static String intToRoman(int number) {
        if (number == 0) return "N";
        String pre = "";
        if (number < 0) {
            number = number * (-1);
            pre = "-";
        }
        return pre + romaniser(number);
    }

    public static String romaniser(int number) {
        int l = map.floorKey(number);
        if (number == l) {
            return map.get(number);
        }
        return map.get(l) + romaniser(number - l);
    }
}
