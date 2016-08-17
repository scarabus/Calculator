package com.challenge.calculator;

import java.math.BigDecimal;

public class AddOperation implements Operation {

    Operation lhs;
    Operation rhs;

    AddOperation(Operation lhs, Operation rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public BigDecimal calculate() {
        return lhs.calculate().add(rhs.calculate());
    }

}
