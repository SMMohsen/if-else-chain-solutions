package com.refactor.solutions.polymorphism.operations;

public class Addition implements MathematicalOperation {

    @Override
    public Double calculate(Double arg1, Double arg2) {
        return arg1 + arg2;
    }
}
