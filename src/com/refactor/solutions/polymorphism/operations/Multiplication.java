package com.refactor.solutions.polymorphism.operations;

import com.refactor.solutions.polymorphism.operations.MathematicalOperation;

public class Multiplication implements MathematicalOperation {

    @Override
    public Double calculate(Double arg1, Double arg2) {
        return arg1 * arg2;
    }
}
