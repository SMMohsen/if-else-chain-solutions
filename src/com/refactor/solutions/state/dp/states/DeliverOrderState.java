package com.refactor.solutions.state.dp.states;

import com.refactor.solutions.state.dp.Order;

public class DeliverOrderState implements  OrderState {

    private Order order;

    public DeliverOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void review() {
        System.out.println("Order already reviewed");
    }

    @Override
    public void accept() {
        System.out.println("Order already accepted");
    }

    @Override
    public void prepare() {
        order.setCurrentState(order.getPrepareOrder());
        System.out.println("Order is preparing");
    }

    @Override
    public void deliver() {
        System.out.println("Order already in his way to you");
    }

    @Override
    public String getName() {
        return "ORDER DELIVERED";
    }
}
