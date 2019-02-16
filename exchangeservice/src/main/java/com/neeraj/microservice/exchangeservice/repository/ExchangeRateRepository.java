package com.neeraj.microservice.exchangeservice.repository;

import com.neeraj.microservice.exchangeservice.model.ExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ExchangeRateRepository extends JpaRepository<ExchangeRate, Integer> {

    ExchangeRate findByCurrencyFromAndCurrencyTo(String from, String to);
}
