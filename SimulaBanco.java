import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import org.generation.util.ReciboSaldo;
import org.generation.util.banco.Cuenta;
import org.generation.util.banco.CuentaCredito;
import org.generation.util.banco.CuentaDebito;

public class SimulaBanco {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2025, Calendar.MAY, 1);
		Calendar calendarCorte = Calendar.getInstance();
		calendar.set(2025, Calendar.MAY, 31);
		HashMap<Integer, Cuenta> cuentas = new HashMap<>();
		cuentas.put(1001, new CuentaDebito(2000, "D8001", calendar.getTime(), 1000, "Juan Pérez"));
		cuentas.put(1002, new CuentaCredito(0, "C7001", calendarCorte.getTime(), calendar.getTime(), 0.35f, 3000.00, "María Díaz"));
		cuentas.put(1003, new CuentaDebito(1500, "D8002", calendar.getTime(), 1000, "Jorge Martínez"));
		cuentas.put(1004, new CuentaCredito(0, "C7002", calendarCorte.getTime(),	calendar.getTime(), 0.35f, 4500.00, "Mónica Hernández"));
		
		System.out.println(cuentas.get(1001));
		System.out.println(cuentas.get(1002));
		System.out.println(cuentas.get(1003));
		System.out.println(cuentas.get(1004));
		
		cuentas.get(1001).deposito(300);
		cuentas.get(1002).retiro(1000);
		cuentas.get(1003).retiro(150);
		cuentas.get(1004).deposito(400);
		
	    ReciboSaldo.Imprimir(cuentas.get(1001));
	    ReciboSaldo.Imprimir(cuentas.get(1002));
	    ReciboSaldo.Imprimir(cuentas.get(1003));
	    ReciboSaldo.Imprimir(cuentas.get(1004));
		
	}//main
}//class Banco
