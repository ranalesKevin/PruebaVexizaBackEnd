package com.pruebaVexiza.backEnd.mapper;

import java.util.ArrayList;
import java.util.List;

import org.mapstruct.Mapper;

import com.pruebaVexiza.backEnd.dto.VehicleDTO;
import com.pruebaVexiza.backEnd.entity.Vehicle;

@Mapper
public interface VehicleDTOMapper {

	default List<VehicleDTO> toVehicleDTO(List<Vehicle> entities) {
		List<VehicleDTO> result = new ArrayList<>();
		for (Vehicle entity : entities) {
			result.add(toVehicleDTO(entity));
		}
		return result;
	}

	default VehicleDTO toVehicleDTO(Vehicle entity) {
		return new VehicleDTO(
				entity.getCodigo(), 
				entity.getNombre(), 
				entity.getConsumo(), 
				entity.getVelocidadMaxima(),
				entity.getFechaAdquisicion(),
				entity.getTipoVehiculo());
	}

	default Vehicle toVehicle(VehicleDTO entity) {
		return new Vehicle(
				entity.getCodigo(), 
				entity.getNombre(), 
				entity.getConsumo(), 
				entity.getVelocidadMaxima(),
				entity.getFechaAdquisicion(), 
				entity.getTipoVehiculo());
	}

}
