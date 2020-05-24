package com.company.Math.Equations;

import com.company.Math.Operations.Roman;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoNumbersEquationTest {

    String[] operators = new String[]{"/", "*", "-", "+"};

    @Test
    void solve() {
        for (int i = 0; i < 5000; i++) {
            int rnd1 = ThreadLocalRandom.current().nextInt(1, 10);
            int rnd2 = ThreadLocalRandom.current().nextInt(1, 10);
            String rndOper = operators[ThreadLocalRandom.current().nextInt(0, operators.length)];

            String arabExpr = rnd1 + " " + rndOper + " " + rnd2;
            String romanExpr = Roman.intToRoman(rnd1) + " " + rndOper + " " + Roman.intToRoman(rnd2);

            int exp = expected(rnd1, rnd2, rndOper);
            TwoNumbersEquation equ1 = new TwoNumbersEquation(arabExpr);
            TwoNumbersEquation equ2 = new TwoNumbersEquation(romanExpr);

            assertEquals(exp, equ1.solve());
            assertEquals(exp, equ2.solve());

        }
    }

    Integer expected(int a1, int a2, String oper) {
        switch (oper) {
            case "+":
                return a1 + a2;
            case "-":
                return a1 - a2;
            case "*":
                return a1 * a2;
            case "/":
                return a1 / a2;
        }
        return null;
    }
}