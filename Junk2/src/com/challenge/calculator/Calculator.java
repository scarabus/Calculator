package com.challenge.calculator;

import java.math.BigDecimal;

public class Calculator {

    Operation op;

    Calculator(String input) {
        op = OperationFactory.getOp(input);
    }

    public BigDecimal calculate() {
        return op.calculate();
    }
}
