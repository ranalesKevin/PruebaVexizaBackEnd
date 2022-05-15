package com.pruebaVexiza.backEnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaVexiza.backEnd.dto.VehicleDTO;
import com.pruebaVexiza.backEnd.mapper.VehicleDTOMapper;
import com.pruebaVexiza.backEnd.usecase.VehiclesUseCase;

@RestController
@RequestMapping("/api/vehicles")
@CrossOrigin(origins = "http://localhost:4200")
public class VehiculosController {

	@Autowired
	private VehiclesUseCase vehiclesUseCase;

	@Autowired
	private VehicleDTOMapper mapper;

	@GetMapping("findAllVehicles")
	public ResponseEntity<List<VehicleDTO>> findAllVehicles() {
		List<VehicleDTO> result = mapper.toVehicleDTO(vehiclesUseCase.findAllVehicles());
		return ResponseEntity.ok().body(result);
	}

	@DeleteMapping("deleteVehicles/{id}")
	public void deleteVehicles(@PathVariable("id") Integer idVehicle) {
		vehiclesUseCase.delete(idVehicle);
	}

	@PostMapping("updateVehicle")
	public void updateVehicle(@RequestBody(required = true) VehicleDTO vehicle) {
		vehiclesUseCase.updateVehicle(mapper.toVehicle(vehicle));
	}

	@PostMapping("createVehicle")
	public void createVehicle(@RequestBody(required = true) VehicleDTO vehicle) {
		vehiclesUseCase.createVehicle(mapper.toVehicle(vehicle));
	}

}
