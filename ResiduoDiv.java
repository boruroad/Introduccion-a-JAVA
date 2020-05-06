public class ResiduoDiv{
	public static void main (String [] pps){ /* Aqui convertimos y probamos operadores básicos, declaramos variables
			y compilamos muchas veces*/
		double num1,num2;
		num1 =12;
		num2 =5;

		double resultado= num1/num2;
		System.out.println("La división de "+ (int)num2+" entre "+(int)num1+ " es "+ resultado);
		/**colocar un double para convertirlo a int solo debes poner (el tipo de dato que deseas convertir) a un lado 
		a un lado de la variable, eso se llama refundición*/

		double nu1 = 100;
		double nu2 = 30;
		double answ = nu1%nu2;
		double resp =  nu1/nu2;
			System.out.println("\nEL resultado de la division de "+(int)nu1+ " entre "+(int)nu2+" es "+ resp);
			System.out.println("\nEL residuo de la division de "+(int)nu1+ " entre "+(int)nu2+" es "+ (int)answ);
	}
}