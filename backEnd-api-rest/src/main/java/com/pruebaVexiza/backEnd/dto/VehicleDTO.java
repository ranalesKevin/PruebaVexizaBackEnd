package com.pruebaVexiza.backEnd.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;


public class VehicleDTO{

    @JsonProperty
	private Integer codigo;
	
	@JsonProperty
	private String nombre;
	
	@JsonProperty
	private Float consumo;
	
	@JsonProperty
	private Integer velocidadMaxima;
	
	@JsonProperty
	private Date fechaAdquisicion;
	
	@JsonProperty
	private String tipoVehiculo;
	
	public VehicleDTO() {
		super();
	}

	public VehicleDTO(Integer codigo, String nombre, Float consumo, Integer velocidadMaxima,
			Date fechaAdquisicion, String tipoVehiculo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.consumo = consumo;
		this.velocidadMaxima = velocidadMaxima;
		this.fechaAdquisicion = fechaAdquisicion;
		this.tipoVehiculo = tipoVehiculo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Float getConsumo() {
		return consumo;
	}

	public void setConsumo(Float consumo) {
		this.consumo = consumo;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public Date getFechaAdquisicion() {
		return fechaAdquisicion;
	}

	public void setFechaAdquisicion(Date fechaAdquisicion) {
		this.fechaAdquisicion = fechaAdquisicion;
	}

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
	
}
