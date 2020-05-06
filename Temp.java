import java.util.Scanner;
public class Temp {
	public static void main(String[] args) {
		int valor, valor2;
		int escala, escala2;

		Scanner lector = new Scanner(System.in);
	Temperatura temp = new Temperatura(valor, escala);
	Temperatura temp2 = new Temperatura(valor2, escala2);

	System.out.println("Ingresa valor Temperatura");
	valor = lector.nexInt();

	System.out.println("Ingresa la escala de Temperatura");
	escala =lector.nexInt();

	System.out.println("Ingresa valor Temperatura");
	valor2 = lector.nexInt();

	System.out.println("Ingresa la escala de Temperatura");
	escala2 =lector.nexInt();

	System.out.println("La temperatura mayor es "+temp.TemperaturaEnCelsius());
	}
}

