package com.pruebaVexiza.backEnd.repository.execute;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebaVexiza.backEnd.entities.VehicleEntity;

public interface VehicleCrudRepository extends JpaRepository<VehicleEntity, Integer>{

}
