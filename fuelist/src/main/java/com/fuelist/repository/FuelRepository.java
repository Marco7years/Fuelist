package com.fuelist.repository;

import com.fuelist.entities.FuelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

interface FuelRepository extends JpaRepository<FuelEntity, Long> {}
