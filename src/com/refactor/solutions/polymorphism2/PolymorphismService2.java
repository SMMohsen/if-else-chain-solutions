package com.refactor.solutions.polymorphism2;

import com.refactor.solutions.polymorphism2.rules.CarBrandAllowed;
import com.refactor.solutions.polymorphism2.rules.ManufactureYearGreaterThan2000;
import com.refactor.solutions.polymorphism2.rules.ValidityRule;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PolymorphismService2 {

    /*
     * this example also uses polymorphism but with another technique to apply some business rules on
     * Car Object to check them and group the status of each rule to provide a report in such clean way
     */

    private final static List<ValidityRule> rules = Arrays.asList(
            new CarBrandAllowed(),
            new ManufactureYearGreaterThan2000()
    );

    public static void main(String[] args) {

        Car car = new Car("xyz", LocalDate.parse("2020-01-01"), "GERMANY", 0.0, 5000.0);

        List<String> rulesResult = new ArrayList<>();
        for(ValidityRule rule : rules)
            rulesResult.add(rule.applyRule(car));

        System.out.println("result "+rulesResult.toString());
    }
}
