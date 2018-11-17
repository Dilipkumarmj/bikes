package com.globamatics.bikes.repositories;

import com.globamatics.bikes.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike,Long> {
}
