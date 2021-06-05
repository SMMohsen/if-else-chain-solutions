package com.refactor.solutions.state.dp;

public class StateDPService {


    /*
     * this example uses State DP to move Order object from one state to another nd perform state action
     * with avoiding multiple if-else chain and can go forward or backward with Order object
     */
    public static void main(String[] args) {
        Order order = new Order("order123","customer456");

        order.review();
        order.accept();
        order.prepare();
        order.review();
        order.accept();
        order.prepare();
        order.deliver();

        order.getCurrentState();
    }
}
