package com.challenge.calculator;

import java.math.BigDecimal;

public class NumericOperation implements Operation {

    BigDecimal value;

    NumericOperation(String input) {
        value = new BigDecimal(input);
    }

    @Override
    public BigDecimal calculate() {
        return value;
    }
}
