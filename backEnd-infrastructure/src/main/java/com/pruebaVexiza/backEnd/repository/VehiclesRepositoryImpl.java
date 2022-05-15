package com.pruebaVexiza.backEnd.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pruebaVexiza.backEnd.entity.Vehicle;
import com.pruebaVexiza.backEnd.mapper.VehicleMapper;
import com.pruebaVexiza.backEnd.repository.execute.VehicleCrudRepository;

@Repository
public class VehiclesRepositoryImpl implements VehiclesRepository {

	@Autowired
	private VehicleMapper vehicleMapper;

	@Autowired
	private VehicleCrudRepository crudRepository;

	@Override
	public List<Vehicle> findAllVehicles() {
		return vehicleMapper.toVehicle(crudRepository.findAll());
	}

	@Override
	public void deleteVehicle(Integer idVehiculo) {
		crudRepository.deleteById(idVehiculo);
	}

	@Override
	public void updateVehicle(Vehicle vehicle) {
			crudRepository.save(vehicleMapper.toVehicleEntity(vehicle));
	}

	@Override
	public void createVehicle(Vehicle vehicle) {
			crudRepository.save(vehicleMapper.toVehicleEntity(vehicle));
	}

}
