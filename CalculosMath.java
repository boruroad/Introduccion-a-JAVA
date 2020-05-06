public class CalculosMath {
	public static void main(String[] args) {
		
		//Redondeo 	
		double num1 = 5.85;
		int resultado = (int)Math.round(num1);
		/*Transformamos un dato double a int, poniendo
		lo que queremos convertir, antes de la clase*/
			System.out.println("El redondeo de "+num1+ " es " +resultado);

			//Elevar algo
		double base = 5;
		double exponente;
		exponente=3;


		int respuesta = (int)Math.pow(base, exponente);
		//Convertimos un double a int gracias a Refundición
			System.out.println("El resultado de "+(int)base+ " elevado a "+ (int)exponente+" es " +respuesta);	


			//Sacar raiz cuadrada
		double raiz=9;
		  int ans = (int)Math.sqrt(raiz);
			System.out.println("La raiz cuadrada de "+ (int)raiz+ " es "+ans);

							
	}
} 