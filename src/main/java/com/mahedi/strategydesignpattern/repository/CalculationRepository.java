package com.mahedi.strategydesignpattern.repository;

import com.mahedi.strategydesignpattern.model.Calculation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalculationRepository extends JpaRepository<Calculation, Long> {
}
