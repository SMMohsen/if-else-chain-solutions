package com.refactor.solutions.state.dp.states;

import com.refactor.solutions.state.dp.Order;

public class AcceptOrderState implements OrderState {
    private Order order;

    public AcceptOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void review() {
        order.setCurrentState(order.getReviewOrder());
        System.out.println("Order return to review process");
    }

    @Override
    public void accept() {
        System.out.println("Order already accepted");
    }

    @Override
    public void prepare() {
        order.setCurrentState(order.getPrepareOrder());
        System.out.println("Order is preparing :)");
    }

    @Override
    public void deliver() {
        System.out.println("Order not prepared yet");
    }

    @Override
    public String getName() {
        return "ORDER ACCEPTED";
    }
}
