package com.pruebaVexiza.backEnd.mapper;

import java.util.ArrayList;
import java.util.List;

import org.mapstruct.Mapper;

import com.pruebaVexiza.backEnd.entities.VehicleEntity;
import com.pruebaVexiza.backEnd.entity.Vehicle;

@Mapper
public interface VehicleMapper {
	
	default List<Vehicle> toVehicle(List<VehicleEntity> entities) {
		if(entities == null) {
			return new ArrayList<>();
		}
		
		List<Vehicle> result = new ArrayList<>();
		for (VehicleEntity entity : entities) {
				result.add(toVehicle(entity));
		}
		return result;
	}

	default Vehicle toVehicle(VehicleEntity entity){
		return new Vehicle(
				entity.getCodigo(), 
				entity.getNombre(),
				entity.getConsumo(), 
				entity.getVelocidadMaxima(), 
				entity.getFechaAdquisicion(),
				entity.getTipoVehiculo());
	}
	
	default VehicleEntity toVehicleEntity(Vehicle vehicle){
		return new VehicleEntity(
				vehicle.getCodigo(), 
				vehicle.getNombre(),
				vehicle.getConsumo(), 
				vehicle.getVelocidadMaxima(), 
				vehicle.getFechaAdquisicion(),
				vehicle.getTipoVehiculo());
	}


}
