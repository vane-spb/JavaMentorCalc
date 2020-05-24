/*

Checks if string is correct case with two I-X numbers with /*- or + operator

 */

package com.company.Parsers;

public final class TestRoman {

    public static boolean testString(String string) {
        String allRomanians = "(I|(II)|(III)|(IV)|(V)|(VI)|(VII)|(VIII)|(IX)|X)";
        return string.matches(allRomanians + "[ ][-+/*][ ]" + allRomanians);
    }
}
