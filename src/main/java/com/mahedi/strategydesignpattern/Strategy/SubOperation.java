package com.mahedi.strategydesignpattern.Strategy;

import org.springframework.stereotype.Component;

@Component("sub")
public class SubOperation implements MathOperationStrategy{
    @Override
    public int calculate(int num1, int num2) {
        return num1-num2;
    }
}
