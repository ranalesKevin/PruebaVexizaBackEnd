package com.pruebaVexiza.backEnd.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import com.pruebaVexiza.backEnd.entities.VehicleEntity;
import com.pruebaVexiza.backEnd.entity.Vehicle;
import com.pruebaVexiza.backEnd.mapper.VehicleMapper;
import com.pruebaVexiza.backEnd.repository.execute.VehicleCrudRepository;

@ExtendWith(MockitoExtension.class)
class VehiclesRepositoryImplTest {
	
	@InjectMocks
	private VehiclesRepositoryImpl vehiclesRepository;
	
	@Spy
	private VehicleMapper vehicleMapper;

	@Mock
	private VehicleCrudRepository crudRepository;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	void whenCallFindAllVehiclesExpectedListVehicle() {
		//GIVEN
		List<VehicleEntity> listVehiculos = new ArrayList<>();
		VehicleEntity vehiculoEsperado = new VehicleEntity(100002, "Nombre Vehiculo Pruebas", 20f, 100, new Date(), "Coche");
		listVehiculos.add(vehiculoEsperado);
		
		when(this.crudRepository.findAll()).thenReturn(listVehiculos);
		
		//WHEN
		List<Vehicle> response = vehiclesRepository.findAllVehicles();
		
		//THEN
		assertNotNull(response);
		assertEquals(vehiculoEsperado.getCodigo(), response.get(0).getCodigo());
		assertEquals(vehiculoEsperado.getNombre(), response.get(0).getNombre());
		assertEquals(vehiculoEsperado.getConsumo(), response.get(0).getConsumo());
	}
	
	@Test
	void whenCallFindAllVehiclesExpectedListEmpty() {
		//GIVEN
		when(this.crudRepository.findAll()).thenReturn(new ArrayList<>());

		//WHEN
		List<Vehicle> response = vehiclesRepository.findAllVehicles();
		
		//THEN
		assertNotNull(response);
		
	}
	
	
}
