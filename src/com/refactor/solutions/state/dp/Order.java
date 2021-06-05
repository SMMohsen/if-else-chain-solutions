package com.refactor.solutions.state.dp;

import com.refactor.solutions.state.dp.states.*;

public class Order {

    private String orderId;
    private String customerId;

    private OrderState reviewOrder;
    private OrderState acceptOrder;
    private OrderState prepareOrder;
    private OrderState deliverOrder;

    private OrderState currentState;

    public Order(String orderId,String customerId) {
        this.orderId = orderId;
        this.customerId = customerId;

        this.reviewOrder = new ReviewOrderState(this);
        this.acceptOrder = new AcceptOrderState(this);
        this.prepareOrder = new PrepareOrderState(this);
        this.deliverOrder = new DeliverOrderState(this);

        this.currentState = getReviewOrder();

    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public OrderState getReviewOrder() {
        return reviewOrder;
    }

    public OrderState getAcceptOrder() {
        return acceptOrder;
    }

    public OrderState getPrepareOrder() {
        return prepareOrder;
    }

    public OrderState getDeliverOrder() {
        return deliverOrder;
    }

    public void getCurrentState() {
        System.out.println("current state :" +currentState.getName());
    }

    public void setCurrentState(OrderState orderState) {
        this.currentState = orderState;
    }


    public void review() {
        currentState.review();
    }

    public void accept() {
        currentState.accept();
    }

    public void prepare() {
        currentState.prepare();
    }

    public void deliver() {
        currentState.deliver();
    }
}
