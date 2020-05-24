package com.company.Parsers;

import com.company.Math.Operations.OperatorHandler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BasicParserTest {

    @Test
    void getNumber() {
        BasicParser bp = new BasicParser("8 + 7");

        assertEquals(5, bp.getNumber("5"));
        assertEquals(9, bp.getNumber("IX"));
    }

    @Test
    void ParserTest() {
        String[] equations = new String[]{
                "5 + 9", "8 + 6", "I * III"
        };

        int[] a1 = new int[]{5, 8, 1};
        int[] a2 = new int[]{9, 6, 3};
        OperatorHandler[] oper = new OperatorHandler[]{
                new OperatorHandler("+"), new OperatorHandler("+"),
                new OperatorHandler("*")
        };

        for (int i = 0; i < equations.length; i++) {
            BasicParser parser = new BasicParser(equations[i]);
            assertEquals(parser.getA1(), a1[i]);
            assertEquals(parser.getA2(), a2[i]);
            assertEquals(parser.getOperation().getOperator().doSmf(5, 8),
                    oper[i].getOperator().doSmf(5, 8));
        }
    }
}