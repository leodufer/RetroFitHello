package com.oss.retrofithello.model;

public class Alumno {
	
	private String nombre;
	private String cedula;
	private String codigo;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", cedula=" + cedula + ", codigo="
				+ codigo + "]";
	}
	
}
