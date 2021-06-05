package com.refactor.solutions.predicate.function.pair;

public class CreditCard {

    private String id;
    private Double limit;
    private Integer produceYear;

    public CreditCard(String id, Double limit, Integer produceYear) {
        this.id = id;
        this.limit = limit;
        this.produceYear = produceYear;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    public Integer getProduceYear() {
        return produceYear;
    }

    public void setProduceYear(Integer produceYear) {
        this.produceYear = produceYear;
    }
}
