package com.company.Parsers;

import com.company.Math.Operations.OperatorHandler;
import com.company.Math.Operations.Roman;

/*

This Parser is a specific implementation
Not scalable!
Gets two arab or romanian numbers and an operator (/*+-) between them from string

 */

public class BasicParser implements Parser {
    private final Integer a1;
    private final Integer a2;
    private final OperatorHandler operation;

    public BasicParser(String string) {
        String[] parts = string.split(" ");
        a1 = getNumber(parts[0]);
        operation = new OperatorHandler(parts[1]);
        a2 = getNumber(parts[2]);
    }

    //only for tested strings
    protected Integer getNumber(String s) {
        if (s.matches("[1-9]|(10)"))
            return Integer.parseInt(s);
        else {
            return new Roman().romanToInt(s);
        }
    }

    public Integer getA1() {
        return a1;
    }

    public Integer getA2() {
        return a2;
    }

    public OperatorHandler getOperation() {
        return operation;
    }
}
