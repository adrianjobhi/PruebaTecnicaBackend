package org.generation.util;

import java.util.HashMap;

import org.generation.util.banco.CuentaCredito;
import org.generation.util.banco.CuentaDebito;

public class Banco {
	private HashMap<Integer, Imprimible> cuentas;
	
	public Banco() {
		this.cuentas = new HashMap<>();
	}//constructor
	
	public boolean agregarCuenta(Imprimible cuenta) {
		if (cuenta == null) {
			return false;
		}//if
		int numero = cuenta.getNumeroCuenta();
		if(cuentas.containsKey(numero)) {
			return false;
		}//if
		cuentas.put(numero, cuenta);
		return true;
	}//agregarCuenta
	
	public boolean cancelarCuenta(int numeroCuenta) {
		cuentas.remove(numeroCuenta);
		return true;
	}//cancelarCuenta
	
	public void accederCuenta(int numeroCuenta) {
		Imprimible cuenta = cuentas.get(numeroCuenta);
		
		if(cuenta == null) {
			System.out.println("El numero de cuenta: " + numeroCuenta + " no existe");
			return;
		}
		ReciboSaldo.Imprimir(cuenta);
	}//accederCuenta
	
	public void modificarCuenta(int numeroCuenta, int nuevaCuenta) {
		
	}//modificarCuenta
		
	
	public void reporte() {
		double totalDebito = 0;
		double totalCredito = 0;

		for(Imprimible c : cuentas.values()) {
			if(c instanceof CuentaDebito) {
				totalDebito += c.getSaldo();
			}else if (c instanceof CuentaCredito) {
				totalCredito += c.getSaldo()-3;
			}//else if
		}//for
		System.out.println("+=================================================");
		System.out.println("| Reporte Banco Seguritas");
		System.out.println("| Total en cuentas de débito: " + totalDebito);
		System.out.println("| Total en cuentas de crédito : " + totalCredito);
		System.out.println("|                    Gracias :D ...");
		System.out.println("+=================================================");
	}
}
