package com.refactor.solutions.polymorphism2;

import java.time.LocalDate;

public class Car {

    private String brand;
    private LocalDate manufactureDate;
    private String manufactureCity;
    private Double discount;
    private Double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String type) {
        this.brand = type;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getManufactureCity() {
        return manufactureCity;
    }

    public void setManufactureCity(String manufactureCity) {
        this.manufactureCity = manufactureCity;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Car(String brand, LocalDate manufactureDate, String manufactureCity, Double discount, Double price) {
        this.brand = brand;
        this.manufactureDate = manufactureDate;
        this.manufactureCity = manufactureCity;
        this.discount = discount;
        this.price = price;
    }
}

