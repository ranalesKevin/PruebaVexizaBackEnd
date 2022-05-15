package com.pruebaVexiza.backEnd.usecase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pruebaVexiza.backEnd.entity.Vehicle;
import com.pruebaVexiza.backEnd.repository.VehiclesRepository;

@Component
public class VehiclesUseCaseImpl implements VehiclesUseCase{
	
	@Autowired
	private VehiclesRepository vehiclesRepository;

	@Override
	public List<Vehicle> findAllVehicles() {
		return vehiclesRepository.findAllVehicles();
	}
	
	@Override
	public void delete(Integer idVehicle) {
		vehiclesRepository.deleteVehicle(idVehicle);
	}

	@Override
	public void updateVehicle(Vehicle vehicle) {
		vehiclesRepository.updateVehicle(vehicle);
	}

	@Override
	public void createVehicle(Vehicle vehicle) {
		vehiclesRepository.createVehicle(vehicle);
	}
	
}
