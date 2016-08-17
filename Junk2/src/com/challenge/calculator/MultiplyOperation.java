package com.challenge.calculator;

import java.math.BigDecimal;

public class MultiplyOperation implements Operation {

    Operation lhs;
    Operation rhs;

    MultiplyOperation(Operation lhs, Operation rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public BigDecimal calculate() {
        return lhs.calculate().multiply(rhs.calculate());
    }

}
