package org.generation.util.banco;

import java.util.Date;

import org.generation.util.Imprimible;

public class CuentaCredito extends Cuenta implements Imprimible{
	private double limite;
	private float tasa;
	private Date fechaCorte;
	private Date fechaLimitePago;
	
	
	public CuentaCredito(double saldo, String numeroCliente, Date fechaCorte, Date fechaLimitePago, float tasa, double limite,
			String nombreCliente) {
		super(saldo, numeroCliente, fechaCorte, nombreCliente);
		this.limite = limite;
		this.tasa = tasa;
		this.fechaCorte = fechaCorte;
		this.fechaLimitePago = fechaLimitePago;
	}//constructor
	
	public double getLimite() {
		return limite;
	}//getLimite
	public void setLimite(double limite) {
		this.limite = limite;
	}//setLimite
	public float getTasa() {
		return tasa;
	}//getTasa
	public void setTasa(float tasa) {
		this.tasa = tasa;
	}//setTasa
	public Date getFechaCorte() {
		return fechaCorte;
	}//getFechaCorte
	public void setFechaCorte(Date fechaCorte) {
		this.fechaCorte = fechaCorte;
	}//setFechaCorte
	
	@Override
	public double getSaldo() {
		setSaldo(saldo+3);
		return saldo;
	}//getSaldo
	
	@Override
	public double retiro(double cantidad) {
		if (cantidad <= 0) {
			return saldo;
		}
		if (cantidad > (limite-saldo)) {
			setSaldo(saldo+5);
		}else {
			double comision = cantidad * 0.05;
			setSaldo(cantidad + saldo + comision);
		}
		return saldo;
	}//retiro

	@Override
	public double deposito(double cantidad) {
		if(cantidad<=0) {
			return saldo;
		}
		setSaldo(saldo - cantidad);
		return saldo;
	}//deposito
	
	@Override
	public String toString() {
		return "Cuenta Crédito [" + super.toString() +
				" Tasa=" + getTasa() + "%, Límite="
				+ getLimite() + "]";
	}//toString
	
}
