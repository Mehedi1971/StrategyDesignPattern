package com.mahedi.strategydesignpattern.service.Impl;

import com.mahedi.strategydesignpattern.Strategy.MathOperationStrategy;
import com.mahedi.strategydesignpattern.model.Calculation;
import com.mahedi.strategydesignpattern.repository.CalculationRepository;
import com.mahedi.strategydesignpattern.service.MathOperationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
//@RequiredArgsConstructor
//@Primary
public class MathOperationServiceImpl implements MathOperationService {
    private final Map<String, MathOperationStrategy> mathOperationStrategyMap;
    private final CalculationRepository calculationRepository;

    public MathOperationServiceImpl(
            Map<String, MathOperationStrategy> mathOperationStrategyMap,
            CalculationRepository calculationRepository
    ) {
        this.mathOperationStrategyMap = mathOperationStrategyMap;
        this.calculationRepository = calculationRepository;
    }
    public int performOperation(int a, int b, String operation) {
        MathOperationStrategy mathOperationStrategy = mathOperationStrategyMap.get(operation);
        int result = mathOperationStrategy.calculate(a, b);
        saveCalculationHistory(a, b, operation, result);
        return result;
    }

    private void saveCalculationHistory(int a, int b, String operation, int result) {
        Calculation calculation= new Calculation();
        calculation.setOperandA(a);
        calculation.setOperandB(b);
        calculation.setOperation(operation);
        calculation.setResult(result);
        calculationRepository.save(calculation);
    }
}
