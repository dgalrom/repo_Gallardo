package modelo;

public class Banco {

	public boolean abrirCuenta(int tipo, Persona titular, double saldoInicial) {
		
		boolean operacionExitosa = true;
		/**
		 * 1.CA
		 * 2.CCP
		 * 3.CCE
		 */
		switch (tipo) {
		case 1:
			try {
			CuentaBancaria cba = new CuentaAhorro(titular, saldoInicial);
			} catch (Exception e) {
			operacionExitosa = false;
			}
			break;
		case 2:
			try {
			CuentaBancaria ccp = new CuentaCorrientePersonal(titular, saldoInicial);
			}catch (Exception e) {
			operacionExitosa = false;
			}
			break;
		case 3:
			try {
			CuentaBancaria cce = new CuentaCorrienteEmpresa(titular, saldoInicial, maximoDescubiertoPermitido, interesDescubierto);
			}catch (Exception e) {
			operacionExitosa = false;
			}
			break;
		default: operacionExitosa = false;
			break;
		}
		return operacionExitosa;
		
	}
	
}
