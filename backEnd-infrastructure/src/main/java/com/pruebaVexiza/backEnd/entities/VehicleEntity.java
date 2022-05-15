package com.pruebaVexiza.backEnd.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "vehicle")
public class VehicleEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigo;
	
	@Column
	private String nombre;
	
	@Column
	private Float consumo;
	
	@Column
	private Integer velocidadMaxima;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date fechaAdquisicion;
	
	@Column
	private String tipoVehiculo;

	
	
	public VehicleEntity() {
		super();
	}

	public VehicleEntity(Integer codigo, String nombre, Float consumo, Integer velocidadMaxima,
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


