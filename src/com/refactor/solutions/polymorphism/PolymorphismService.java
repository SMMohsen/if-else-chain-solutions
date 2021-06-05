package com.refactor.solutions.polymorphism;

import com.refactor.solutions.polymorphism.operations.MathematicalOperation;

public class PolymorphismService {


    /*
     * this example uses polymorphism with Factory DP to get the requested mathematical operation
     * and then perform it
     * we have MathematicalOperation interface with multiple implementations and Factory to choose
     * according to String parameter
     */
    public static void main(String[] args) {

        MathematicalOperation operation = MathematicalOperationFactory.getOperation("ADD");
        System.out.println("result "+operation.calculate(5.0,6.0));

        MathematicalOperation operation1 = MathematicalOperationFactory.getOperation("SUB");
        System.out.println("result "+operation1.calculate(5.0,6.0));

    }
}
