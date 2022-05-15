package com.pruebaVexiza.backEnd.repository;

import java.util.List;

import com.pruebaVexiza.backEnd.entity.Vehicle;

public interface VehiclesRepository {

	List<Vehicle> findAllVehicles();

	void deleteVehicle(Integer idVehiculo);

	void updateVehicle(Vehicle vehicle);

	void createVehicle(Vehicle vehicle);
}
