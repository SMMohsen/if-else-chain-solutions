package com.refactor.solutions.state.dp.states;

import com.refactor.solutions.state.dp.Order;

public interface OrderState {

    public void review();

    public void accept();

    public void prepare();

    public void deliver();

    public String getName();
}
