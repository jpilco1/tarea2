package com.distribuida.entities;

import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class Factura {
	private int idFactura;
	private String numFactura;
	private Date fecha;  // Date
	private double totalNeto;  // totalNeto
	private double iva;
	private double total;

	@Autowired
	private Clientes cliente;  // private Cliente cliente;

	public Factura() {
		}

	public Factura(Clientes cliente) {
		this.cliente=cliente;
	}
	
	
	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public String getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(java.util.Date date) {
		this.fecha = (Date) date;
	}

	public double getTotalNeto() {
		return totalNeto;
	}

	public void setTotalNeto(double totalNeto) {
		this.totalNeto = totalNeto;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Clientes getCliente() {
		return cliente;
	}
	
	//metodo inyector

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", numFactura=" + numFactura + ", fecha=" + fecha + ", totalNeto="
				+ totalNeto + ", iva=" + iva + ", total=" + total + ", Cliente=" + cliente + "]";
	}

	
		
	

	
	}
