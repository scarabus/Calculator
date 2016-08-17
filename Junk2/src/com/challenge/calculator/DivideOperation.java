package com.challenge.calculator;

import java.math.BigDecimal;

public class DivideOperation implements Operation {

    Operation lhs;
    Operation rhs;

    DivideOperation(Operation lhs, Operation rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public BigDecimal calculate() {
        return lhs.calculate().divide(rhs.calculate());
    }

}
