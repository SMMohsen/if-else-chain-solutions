package com.refactor.solutions.state.dp.states;

import com.refactor.solutions.state.dp.Order;

public class ReviewOrderState implements OrderState {

    private Order order;

    public ReviewOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void review() {
        System.out.println("The order already under review process");
    }

    @Override
    public void accept() {
        order.setCurrentState(order.getAcceptOrder());
        System.out.println("Dear customer your order has been accepted");
    }

    @Override
    public void prepare() {
        System.out.println("Order have to be accepted firt");
    }

    @Override
    public void deliver() {
        System.out.println("Order not prepared yet");
    }

    @Override
    public String getName() {
        return "ORDER REVIEW";
    }
}
