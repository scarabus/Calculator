package com.challenge.calculator;

import java.math.BigDecimal;

public class SubtractOperation implements Operation {

    Operation lhs;
    Operation rhs;

    SubtractOperation(Operation lhs, Operation rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public BigDecimal calculate() {
        return lhs.calculate().subtract(rhs.calculate());
    }

}
