package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.ExchangeRate;

@Repository
public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Long> {
    ExchangeRate findBySourceCurrencyAndTargetCurrency(String sourceCurrency, String targetCurrency);
}

