import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ACT2_EJ7 {

	public static void main(String[] args) {
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

		// Declaraciones
		String cadenaLeida;
		float fPeso;
		float fAltura;
		short shDorsal;

		// 1) Pido numero dorsal
		shDorsal = pedirDorsal(lector);

		// 2) Pido altura
		fAltura = pidoAltura(lector);

		// 3) Pido peso
		fPeso = pidoPeso(lector);
		
		//Mostras por pantalla
		imprimirPantalla(fPeso, fAltura, shDorsal);

	}
	/**
	 * @author Miguel
	 * @version 1.0
	 * @param Pedimos una variable 
	 * @return devuelve un float que se introduce en la variable fPeso
	 * El metodo que usamos aqui sirve para mostrar por pantalla la informacion
	 */
	public static void imprimirPantalla(float fPeso, float fAltura, short shDorsal) {
		System.out.print("El dorsal número "+ shDorsal+ " mide "+fAltura+" cm y pesa "+fPeso+" kg");
	}
	
	/**
	 * @author Miguel
	 * @version 1.0
	 * @param Pedimos una variable 
	 * @return devuelve un float que se introduce en la variable fPeso
	 * El metodo que usamos aqui sirve para pedir por teclado el peso del usuario
	 */
	public static float pidoPeso(BufferedReader lector) {
		String cadenaLeida;
		float fPeso;
		System.out.print("Introduce su peso (20-180): ");
		try {
			cadenaLeida = lector.readLine();
		} catch (Exception e) {
			cadenaLeida = "";
		}

		// Conversion
		fPeso=Float.parseFloat(cadenaLeida);
		return fPeso;
	}
	
	/**
	 * @author Miguel
	 * @version 1.0
	 * @param Pedimos una variable 
	 * @return devuelve un float que se introduce en la variable fAltura
	 * El metodo que usamos aqui sirve para pedir por teclado la altura del usuario
	 */
	public static float pidoAltura(BufferedReader lector) {
		String cadenaLeida;
		float fAltura;
		System.out.print("Introduce su altura (1-2.5): ");
		try {
			cadenaLeida = lector.readLine();
		} catch (Exception e) {
			cadenaLeida = "";
		}
		
		fAltura=Float.parseFloat(cadenaLeida);
		return fAltura;
	}
	
	/**
	 * @author Miguel
	 * @version 1.0
	 * @param Pedimos una variable 
	 * @return devuelve un short que se introduce en la variable shDorsal
	 * El metodo que usamos aqui sirve para pedir por teclado el dorsal del usuario,
	 */
	public static short pedirDorsal(BufferedReader lector) {
		String cadenaLeida;
		short shDorsal;
		System.out.print("Introduce su numero de dorsal (1-9999): ");
		try {
			cadenaLeida = lector.readLine();
		} catch (Exception e) {
			cadenaLeida = "";
		}

		// Conversion
		shDorsal=Short.parseShort(cadenaLeida);
		return shDorsal;
	}

}
