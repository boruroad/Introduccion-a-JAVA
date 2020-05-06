/**
 * @author
 * @version
 */
public class Formula {
    public static void main(String[] pps) {
	double resultado = 0;
	double r = 6.0;
	int a = 2;
	int b = 3;
	int c = 4;
	int d = 5;

	// Escribir la formula
	double x = ((30/(3*(r+34)))-(9*(a + b*c))+(3+d*(2+a))/(a+b*d));
	resultado+=x;

	System.out.println("\nCon a= "+a+",  b= "+b+",  c= "+c+",  d= "+d+", r= "+r );  //Completar el mensaje
	System.out.println("\nEl resultado de la formula es "+resultado);
    }
}
