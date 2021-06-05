package com.refactor.solutions.polymorphism2.rules;

import com.refactor.solutions.polymorphism2.Car;

public class ManufactureYearGreaterThan2000 implements ValidityRule {

    @Override
    public String applyRule(Car car) {
        if(car.getManufactureDate().getYear() <= 2000)
            return "Manufacture Year is before 2000";
        else
            return "Manufacture Year passed";

    }
}
