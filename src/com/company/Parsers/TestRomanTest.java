package com.company.Parsers;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestRomanTest {

    String[] romanians = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    String[] operators = new String[]{"/", "*", "-", "+"};

    @Test
    void testString() {
        for (int i = 0; i < 100; i++) {
            assertEquals(true, TestRoman.testString(romanEqGenerator()));
        }

        assertEquals(false, TestRoman.testString(""));
        assertEquals(false, TestRoman.testString("IIIVX"));
        assertEquals(false, TestRoman.testString("I + 1"));

    }

    String romanEqGenerator() {
        String a1 = romanians[ThreadLocalRandom.current().nextInt(0, romanians.length)];
        String a2 = romanians[ThreadLocalRandom.current().nextInt(0, romanians.length)];
        String o = operators[ThreadLocalRandom.current().nextInt(0, operators.length)];
        return a1 + " " + o + " " + a2;
    }
}