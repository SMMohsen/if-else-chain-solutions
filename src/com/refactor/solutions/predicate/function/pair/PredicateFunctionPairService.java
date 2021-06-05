package com.refactor.solutions.predicate.function.pair;


import com.refactor.solutions.predicate.function.pair.function.CreditCardLimitFunc;
import com.refactor.solutions.predicate.function.pair.function.ValidityYearsGreaterThanFunc;
import com.refactor.solutions.predicate.function.pair.predicate.CreditCardLimitPredicate;
import com.refactor.solutions.predicate.function.pair.predicate.ValidtiyYearsGreaterThan3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateFunctionPairService {

    static Map<Predicate,Function>  predicateFunctionMap = new HashMap<>();


    /*
     * this technique uses a Map/List<Pair> for predicate as one side and behaviour for another side
     * after that iterate over map/list entries and if predicate is true fire it's behaviour
     */
    public static void main(String[] args) {
        initializeMap();
        CreditCard creditCard = new CreditCard("18653786",7000.0,2020);

        for(Map.Entry<Predicate,Function> entry : predicateFunctionMap.entrySet())
            if(entry.getKey().test(creditCard))
                entry.getValue().apply(creditCard);
    }

    private static void initializeMap() {
        predicateFunctionMap.put(new CreditCardLimitPredicate(),new CreditCardLimitFunc());
        predicateFunctionMap.put(new ValidtiyYearsGreaterThan3(),new ValidityYearsGreaterThanFunc());
    }
}
