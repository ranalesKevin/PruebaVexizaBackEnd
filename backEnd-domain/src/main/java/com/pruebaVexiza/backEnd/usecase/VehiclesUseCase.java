package com.pruebaVexiza.backEnd.usecase;

import java.util.List;

import com.pruebaVexiza.backEnd.entity.Vehicle;

public interface VehiclesUseCase {

	List<Vehicle> findAllVehicles();

	void delete(Integer idVehicle);

	void updateVehicle(Vehicle vehicle);

	void createVehicle(Vehicle vehicle);

}
