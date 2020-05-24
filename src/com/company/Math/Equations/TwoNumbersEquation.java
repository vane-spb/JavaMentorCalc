/*

It's our case, where we have only two integer numbers

 */

package com.company.Math.Equations;

import com.company.Math.Operations.OperatorHandler;
import com.company.Parsers.BasicParser;

public class TwoNumbersEquation implements Equation {
    //Buffered solution to save some resources
    protected Integer solution = null;
    //Our two numbers
    protected Integer a1, a2;
    //required operation
    protected OperatorHandler operation;

    public TwoNumbersEquation(String string) {
        BasicParser parser = new BasicParser(string);
        a1 = parser.getA1();
        a2 = parser.getA2();
        operation = parser.getOperation();
    }

    @Override
    public Integer solve() {
        if (solution == null) {
            solution = (int) operation.getOperator().doSmf(a1, a2);
        }
        return solution;
    }
}
