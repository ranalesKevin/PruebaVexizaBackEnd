package com.pruebaVexiza.backEnd.controller;

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
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.pruebaVexiza.backEnd.dto.VehicleDTO;
import com.pruebaVexiza.backEnd.entity.Vehicle;
import com.pruebaVexiza.backEnd.mapper.VehicleDTOMapper;
import com.pruebaVexiza.backEnd.usecase.VehiclesUseCase;

@ExtendWith(MockitoExtension.class)
class VehiculosControllerTest {
	
	@InjectMocks
	private VehiculosController vehiculosController;
	
	@Mock
	private VehiclesUseCase vehiclesUseCase;
	
	@Spy
	private VehicleDTOMapper mapper;
	
	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	void whenCallFindAllVehiclesExpectedListVehicle() {
		//GIVEN
		List<Vehicle> listVehiculos = new ArrayList<>();
		Vehicle vehiculoEsperado = new Vehicle(100002, "Nombre Vehiculo Pruebas", 20f, 100, new Date(), "Coche");
		listVehiculos.add(vehiculoEsperado);
		
		when(this.vehiclesUseCase.findAllVehicles()).thenReturn(listVehiculos);
		
		//WHEN
		ResponseEntity<List<VehicleDTO>> response = vehiculosController.findAllVehicles();
		
		//THEN
		assertNotNull(response.getBody());
		assertEquals(vehiculoEsperado.getCodigo(), response.getBody().get(0).getCodigo());
		assertEquals(vehiculoEsperado.getNombre(), response.getBody().get(0).getNombre());
		assertEquals(vehiculoEsperado.getConsumo(), response.getBody().get(0).getConsumo());
		assertEquals(vehiculoEsperado.getVelocidadMaxima(), response.getBody().get(0).getVelocidadMaxima());
		assertEquals(vehiculoEsperado.getFechaAdquisicion(), response.getBody().get(0).getFechaAdquisicion());
		assertEquals(vehiculoEsperado.getTipoVehiculo(), response.getBody().get(0).getTipoVehiculo());
	}
	
	@Test
	void whenCallFindAllVehiclesExpectedListEmpty() {
		//GIVEN
		when(this.vehiclesUseCase.findAllVehicles()).thenReturn(new ArrayList<>());
		
		//WHEN
		ResponseEntity<List<VehicleDTO>> response = vehiculosController.findAllVehicles();
		
		//THEN
		assertNotNull(response.getBody());
		assertEquals(HttpStatus.OK, response.getStatusCode());
		
	}

}
