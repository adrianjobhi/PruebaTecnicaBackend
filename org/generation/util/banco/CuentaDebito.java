package org.generation.util.banco;

import java.util.Date;

import org.generation.util.Imprimible;

public class CuentaDebito extends Cuenta implements Imprimible{
	private double montoMinimo;

	public CuentaDebito(double saldo, String numeroCliente, Date fechaApertura, double montoMinimo, String nombreCliente) {
		super(saldo, numeroCliente, fechaApertura, nombreCliente);
		this.montoMinimo = montoMinimo;
	}//constructor

	public double getMontoMinimo() {
		return montoMinimo;
	}//getmontoMinimo
	public void setMontoMinimo(double montoMinimo) {
		this.montoMinimo = montoMinimo;
	}//setmontoMinimo

	@Override
	public double retiro(double cantidad) {
		if (cantidad <= 0) {
			return getSaldo();
		}//if
		if(getSaldo() >= cantidad) {
			setSaldo(getSaldo() - cantidad);
		}//if
		return getSaldo();
	}//retiro

	@Override
	public double deposito(double cantidad) {
		if(cantidad<=0) {
			return getSaldo();
		}
		setSaldo(getSaldo() + cantidad);
		return getSaldo();
	}//deposito

	@Override
	public double getSaldo() {
		return this.saldo;
	}//getSaldo

	@Override
	public String toString() {
		return "CuentaDebito [" + super.toString() + ", Monto mínimo=" + montoMinimo + "]";
	}//toString
	
}//CuentaDebito
