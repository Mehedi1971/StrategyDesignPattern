package com.mahedi.strategydesignpattern.Strategy;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("sum")
@Primary
public class SumOperation implements MathOperationStrategy{

    @Override
    public int calculate(int num1, int num2) {
        return num1+num2;
    }
}
