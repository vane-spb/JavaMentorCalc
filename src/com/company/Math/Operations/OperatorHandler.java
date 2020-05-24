/*

Handle an operator, you need to change this class if number of operators changed
But single responsibility is OK, I think

 */

package com.company.Math.Operations;

public class OperatorHandler {
    IntegerOperation operator;

    public OperatorHandler(String sign) {
        operator = getOperator(sign);
    }

    public IntegerOperation getOperator() {
        return operator;
    }

    protected IntegerOperation getOperator(String string) {
        if (string.equals("/")) return new Division();
        if (string.equals("*")) return new Multiplication();
        if (string.equals("-")) return new Minus();
        if (string.equals("+")) return new Plus();
        return null;
    }
}
