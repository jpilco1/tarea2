package com.distribuida.entities;

import java.util.Date;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Clientes {

	private int idCliente;
	private String nombre;
	private String apellido;
	private String cedula;
	private int edad; // int 
	private Date fechaNacimiento;
	private String direccion;
	private String correo;
	private String telefono;
	
	public Clientes() {
		
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("Se ejecutan tareas despues de la construccion del bean");
	}
	@PreDestroy
	public void preDestroy(){
	System.out.println("Se ejecutan tareas antes ");
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Clientes [idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula="
				+ cedula + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion
				+ ", correo=" + correo + ", telefono=" + telefono + "]";
	}

	
	
	
}
