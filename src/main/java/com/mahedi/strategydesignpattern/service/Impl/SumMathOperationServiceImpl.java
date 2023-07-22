//package com.mahedi.strategydesignpattern.service.Impl;
//
//import com.mahedi.strategydesignpattern.Strategy.MathOperationStrategy;
//import com.mahedi.strategydesignpattern.model.Calculation;
//import com.mahedi.strategydesignpattern.repository.CalculationRepository;
//import com.mahedi.strategydesignpattern.service.MathOperationService;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Service;
//
//@Service
////@RequiredArgsConstructor
////@Primary
//public class SumMathOperationServiceImpl implements MathOperationService {
//    private final MathOperationStrategy mathOperationStrategy;
//    private final CalculationRepository calculationRepository;
//
//    public SumMathOperationServiceImpl(
//            @Qualifier("sum") MathOperationStrategy mathOperationStrategy,
//            CalculationRepository calculationRepository
//    ) {
//        this.mathOperationStrategy = mathOperationStrategy;
//        this.calculationRepository = calculationRepository;
//    }
//    public int performOperation(int a, int b, String operation) {
//        int result = mathOperationStrategy.calculate(a, b);
//        saveCalculationHistory(a, b, operation, result);
//        return result;
//    }
//
//    private void saveCalculationHistory(int a, int b, String operation, int result) {
//        Calculation calculation= new Calculation();
//        calculation.setOperandA(a);
//        calculation.setOperandB(b);
//        calculation.setOperation(operation);
//        calculation.setResult(result);
//        calculationRepository.save(calculation);
//    }
//}
