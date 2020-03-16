package com.robert.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "reserva")
public class Reserva {

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String idRes;
	@Temporal(TemporalType.DATE)
	private Date fechaIngresoRes;
	@Temporal(TemporalType.DATE)
	private Date fechaSalidaRes;
	private int cantidadPersonasRes;
	private String descripcionRes;
	@ManyToOne
	@JoinColumn(name="idCli")
	private Cliente cliente;
	public String getIdRes() {
		return idRes;
	}
	public void setIdRes(String idRes) {
		this.idRes = idRes;
	}
	public Date getFechaIngresoRes() {
		return fechaIngresoRes;
	}
	public void setFechaIngresoRes(Date fechaIngresoRes) {
		this.fechaIngresoRes = fechaIngresoRes;
	}
	public Date getFechaSalidaRes() {
		return fechaSalidaRes;
	}
	public void setFechaSalidaRes(Date fechaSalidaRes) {
		this.fechaSalidaRes = fechaSalidaRes;
	}
	public int getCantidadPersonasRes() {
		return cantidadPersonasRes;
	}
	public void setCantidadPersonasRes(int cantidadPersonasRes) {
		this.cantidadPersonasRes = cantidadPersonasRes;
	}
	public String getDescripcionRes() {
		return descripcionRes;
	}
	public void setDescripcionRes(String descripcionRes) {
		this.descripcionRes = descripcionRes;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
