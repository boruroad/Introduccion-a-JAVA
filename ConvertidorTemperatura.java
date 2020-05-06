/**
 * Uso y aplicación de variables de tipo primitivo (declaracion e inicialización de variables)
 * @author Roberto Adrian Bonilla Ruiz
 * @version 1.0
 */

/**
 * Era un archivo con demasiados errores (todos ellos ya corregidos, la mayoria estaban en la concatenacion de cadenas
 * y otros tantos en la escritura de variables o tipos de dato, mayúsculas o minúsculas)
 */
public class ConvertidorTemperatura {
	public static void main(String [] pps ){
		double celsius;
		double farenheit = 70.5;

		System.out.println("\n***Convertidor grados Celsius***");
		System.out.println("\nLos grados que voy a convertir son:");
		System.out.println(farenheit + " grados farenheit");

		//EL resultado arrojaba cero siempre, si no se cambiaba la operacion "5/9" por .55555
		celsius = (.55555)*(farenheit-32);

		System.out.println("\nLos grados celsius resultantes son:");
		System.out.println(celsius + " grados celsius");
	}
}

