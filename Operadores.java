/**
 * Ejecutar el programa y explicar que sucede en pantalla 
 * @author Roberto Adrian Bonilla Ruiz
 * @version 1.0
 */

/**
 * Al momento de mandar a imprimir el resultado en cada operación, nosotros esperariamos que se diera un resultado exacto
 * pero al declar variables de tipo entero o int, java las redondea, para evitar eso realizamos algo que se llama refundicion
 * que consiste en convertir los datos de un tipo a otro (en los casos que se pueda)
 * Ejemplo: Linea 19 (estabamos dividiendo un entero pero el resultado debia dar double asi que lo convertí	)
 */
public class Operadores {
    public static void main(String[] pps) {
	int divisor = 5, dividendoEntero = 39;
	double dividendoReal = 39.0;
    double resultado =  (double)dividendoEntero / divisor;
    double respuesta =  dividendoReal / divisor;
	System.out.println("dividendoEntero / divisor = "+ (double)resultado);
	System.out.println("dividendoReal / divisor = "+ respuesta);
	System.out.println("dividendoEntero % divisor = "+ dividendoEntero % divisor);
	System.out.println("dividendoReal % divisor = "+ dividendoReal % divisor);
    }
}
