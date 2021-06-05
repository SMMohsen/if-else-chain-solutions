package com.refactor.solutions.predicate.function.pair.predicate;

import com.refactor.solutions.predicate.function.pair.CreditCard;

import java.time.LocalDate;
import java.util.function.Predicate;

public class ValidtiyYearsGreaterThan3 implements Predicate<CreditCard> {

    @Override
    public boolean test(CreditCard creditCard) {
        int currentYear = LocalDate.now().getYear();
        int diff = creditCard.getProduceYear() - currentYear;
        if (diff > 3)
            return true;
        else
            return false;
    }
}
