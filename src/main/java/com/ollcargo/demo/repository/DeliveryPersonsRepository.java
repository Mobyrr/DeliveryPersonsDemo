package com.ollcargo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ollcargo.demo.model.DeliveryPersons;

public interface DeliveryPersonsRepository extends JpaRepository<DeliveryPersons, Integer> {
}