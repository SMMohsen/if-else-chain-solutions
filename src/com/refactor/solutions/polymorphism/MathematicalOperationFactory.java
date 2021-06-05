package com.refactor.solutions.polymorphism;

import com.refactor.solutions.polymorphism.operations.Addition;
import com.refactor.solutions.polymorphism.operations.MathematicalOperation;
import com.refactor.solutions.polymorphism.operations.Multiplication;
import com.refactor.solutions.polymorphism.operations.Subtraction;

public class MathematicalOperationFactory {

    public static MathematicalOperation getOperation(String type) {
        switch (type) {
            case "ADD":
                return new Addition();
            case "SUB" :
                return new Subtraction();
            case "MUL":
                return new Multiplication();
            default:
                throw new RuntimeException("Not supported operation !");
        }
    }
}
