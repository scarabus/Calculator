package com.challenge.calculator;

import java.util.Arrays;
import java.util.List;

public class OperationFactory {

    public static final String DIVIDE = "/";
    public static final String MULTIPLY = "*";
    public static final String ADD = "+";
    public static final String SUBTRACT = "-";

    static List<String> ops = Arrays.asList(ADD, SUBTRACT, DIVIDE, MULTIPLY);

    static Operation getOp(String str) {
        for (String op : ops) {
            int idx = str.indexOf(op);
            if (idx > 1) {
                return getOperation(str.substring(0, idx), op, str.substring(idx + op.length()));
            }
        }
        // not an operation, must be absolute
        return new NumericOperation(str.trim());
    }

    static Operation getOperation(String lhs, String oper, String rhs) {
        switch (oper) {
        case DIVIDE:
            return new DivideOperation(getOp(lhs), getOp(rhs));
        case MULTIPLY:
            return new MultiplyOperation(getOp(lhs), getOp(rhs));
        case ADD:
            return new AddOperation(getOp(lhs), getOp(rhs));
        case SUBTRACT:
            return new SubtractOperation(getOp(lhs), getOp(rhs));
        }
        throw new RuntimeException("Unknown operation " + oper);
    }
}
