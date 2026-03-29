package com.vogdo;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.effectuerOperation();
        context.setStrategy(new StrategyImpl1());
        context.effectuerOperation();
        context.setStrategy(new StrategyImpl2());
        context.effectuerOperation();
        context.setStrategy(new StrategyImpl3());
        context.effectuerOperation();
    }
}