package com.company.Parsers;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestArabTest {

    String[] operators = new String[]{"/", "*", "-", "+"};

    @Test
    void testString() {
        for (int i = 0; i < 100; i++) {
            assertEquals(true, TestArab.testString(arabEqGenerator()));
        }

        assertEquals(false, TestArab.testString(""));
        assertEquals(false, TestArab.testString("IIIVX"));
        assertEquals(false, TestArab.testString("I + 1"));
    }

    String arabEqGenerator() {
        int a1 = ThreadLocalRandom.current().nextInt(1, 10);
        int a2 = ThreadLocalRandom.current().nextInt(1, 10);
        String o = operators[ThreadLocalRandom.current().nextInt(0, operators.length)];
        return a1 + " " + o + " " + a2;
    }
}