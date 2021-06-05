package com.refactor.solutions.predicate.function.pair.predicate;

import com.refactor.solutions.predicate.function.pair.CreditCard;

import java.util.function.Predicate;

public class CreditCardLimitPredicate implements Predicate<CreditCard> {
    @Override
    public boolean test(CreditCard creditCard) {
        if (creditCard.getLimit() > 5000.0)
            return true;
        else
            return false;
    }
}
