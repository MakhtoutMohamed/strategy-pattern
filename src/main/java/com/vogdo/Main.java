package com.vogdo;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Context context = new Context();
        /*context.effectuerOperation();
        context.setStrategy(new StrategyImpl1());
        context.effectuerOperation();
        context.setStrategy(new StrategyImpl2());
        context.effectuerOperation();
        context.setStrategy(new StrategyImpl3());
        context.effectuerOperation();*/
        Scanner scanner = new Scanner(System.in);

        Map<String,Strategy> strategyMap = new HashMap<>();
        Strategy strategy;
        while(true){
            System.out.print("Quelle strategy: ");
            String strategyName = scanner.nextLine();
            strategy = strategyMap.get(strategyName);
            if(strategy == null){
                System.out.println("Creation d'un vouvel objet de StrategyImpl"+strategyName);
                strategy=(Strategy) Class.forName("com.vogdo.StrategyImpl"+strategyName).getConstructor().newInstance();
                strategyMap.put(strategyName,strategy);
            }
            context.setStrategy(strategy);
            context.effectuerOperation();
        }
    }
}