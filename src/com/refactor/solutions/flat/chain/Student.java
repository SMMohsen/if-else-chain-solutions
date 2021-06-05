package com.refactor.solutions.flat.chain;

public class Student {

    private String name;
    private Double gpa;
    private Integer year;

    public Student(String name, Double gpa, Integer year) {
        this.name = name;
        this.gpa = gpa;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
