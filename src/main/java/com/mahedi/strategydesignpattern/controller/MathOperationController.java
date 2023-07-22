package com.mahedi.strategydesignpattern.controller;

import com.mahedi.strategydesignpattern.service.MathOperationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MathOperationController {
//    private final MathOperationServiceImpl mathOperationService;
    private final MathOperationService mathOperationService;

    @GetMapping("/calculate/{operation}")
    public Integer calculate(
            @PathVariable String operation,
            @RequestParam int a,
            @RequestParam int b
    ) {
        int result = mathOperationService.performOperation(a, b, operation);


        return result;
    }
}
