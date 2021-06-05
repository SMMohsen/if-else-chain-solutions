package com.refactor.solutions.predicate.function.pair.function;

import com.refactor.solutions.predicate.function.pair.CreditCard;

import java.util.function.Function;

public class ValidityYearsGreaterThanFunc<R> implements Function<CreditCard,R> {


    @Override
    public R apply(CreditCard creditCard) {
        System.out.println("credit card greater than 3 years validity logic");
        return null;
    }
}
