/*

Checks if string is correct case with two 1-10 numbers with /*- or + operator

 */

package com.company.Parsers;

public final class TestArab {
    public static boolean testString(String string) {
        return string.matches("([1-9]|10) [-+/*] ([1-9]|10)");
    }
}
