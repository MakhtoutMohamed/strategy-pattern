package com.vogdo;

public class DefaultStrategyImpl implements Strategy {
    @Override
    public void operationStrategy() {
        System.out.println("=================================");
        System.out.println("======= Default strategy ========");
        System.out.println("*********************************");
    }
}
