package com.refactor.solutions.polymorphism2.rules;

import com.refactor.solutions.polymorphism2.Car;

import java.util.Arrays;
import java.util.List;

public class CarBrandAllowed implements ValidityRule {

    private final List<String> ALLOWED_BRANDS = Arrays.asList("TOYOTA","BMW","GT");

    @Override
    public String applyRule(Car car) {
        if(!ALLOWED_BRANDS.contains(car.getBrand()))
            return "Car brand not allowed";
        else
            return "Car brand passed";
    }
}
