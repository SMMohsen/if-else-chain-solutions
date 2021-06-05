package com.refactor.solutions.predicate.function.pair.function;

import com.refactor.solutions.predicate.function.pair.CreditCard;

import java.util.function.Function;

public class CreditCardLimitFunc<R> implements Function<CreditCard,R> {
    @Override
    public R apply(CreditCard creditCard) {
        System.out.println("this is credit card limit logic");
        return null;
    }
}
