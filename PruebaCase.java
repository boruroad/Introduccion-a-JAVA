import java.util.Scanner;

public class PruebaCase{
	public static void main(String[] args) {
		int o1, o2, o3;
		String enter;
		Scanner lector = new Scanner(System.in);

		System.out.println("¿Te gustaría saber que personaje del salón eres? \n(Pulsa enter)");
		enter = lector.nextLine();

		System.out.println("Escoge una opción: \n1 \n2 \n3 \n4");
		int opcion = lector.nextInt();
		

		switch(opcion){
			case 1:
				System.out.println("Llegas bien tarde \nEres Incognito");
			break;	
			
			case 2:
				System.out.println("No metiste inglés II \nEres Brenda");
			break;

			case 3:
				System.out.println("Participas en todo y te las sabes de todas todas  \nEres Gretel ");
			break;

			case 4:
				System.out.println("Preguntas de todo\nEres Valeria");
			break;

			default: 
			System.out.println("Opción Inválida");
		}

	}
}