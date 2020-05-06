public class Cad {
	public static void main(String[] args) {
		
		// Declaramos variable de tipo String a "Adrian"
		String nombre = "Dave"; 

		// "Concatenamos la impresion del mensaje con la variable"
		System.out.print("Hola, me llamo "+ nombre); 

		/*Utilizamos su primer método que es .lemgth para saber cuantos caracteres tiene
		la variable nombre*/ 
			System.out.println(" y mi nombre tiene "+ nombre.length()+ " letras ");

				System.out.println("La primera letra es "+nombre.charAt(0));

		int ultimaLetra;

			ultimaLetra=nombre.length();

				System.out.println("La ultima letra de tu nombre es la "+ nombre.charAt(ultimaLetra-1));
	}
}