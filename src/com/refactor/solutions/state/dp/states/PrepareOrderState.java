package com.refactor.solutions.state.dp.states;

import com.refactor.solutions.state.dp.Order;

public class PrepareOrderState implements OrderState {

    private Order order;

    public PrepareOrderState(Order order) {
        this.order = order;
    }

    @Override
    public void review() {
        System.out.println("Order already reviewed");
    }

    @Override
    public void accept() {
        order.setCurrentState(order.getAcceptOrder());
        System.out.println("Order is Accepted");
    }

    @Override
    public void prepare() {
        System.out.println("Order is preparing :)");
    }

    @Override
    public void deliver() {
        order.setCurrentState(order.getDeliverOrder());
        System.out.println("Order in his way to you");
    }

    @Override
    public String getName() {
        return "ORDER PREPARING";
    }
}
