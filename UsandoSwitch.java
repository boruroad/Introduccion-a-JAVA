	import java.util.Scanner;


	public class UsandoSwitch {
		public static void main(String[] args) {
			Scanner lector = new Scanner(System.in);
			final double pi = 3.1416;
			int altura, lado, base;
			double radio;
			double resultado; 

			System.out.println("Escoge una opción: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo \n");
			int figura = lector.nextInt();
			
			switch(figura){
				case 1:
				System.out.println("Introduce el lado");
				lado = lector.nextInt();
				System.out.println("El área del cuadrado es "+(lado*lado));
				break;

				case 2:
				System.out.println("Introduce la base \n");
				base = lector.nextInt();
				System.out.println("\nIntroduce la altura \n");
				altura = lector.nextInt();
				System.out.println("El área del rectángulo es "+(base*altura));
				break;

				case 3:
				System.out.println("Introduce la base");
				base = lector.nextInt();
				System.out.println("\nIntroduce la altura \n");
				altura = lector.nextInt();
				System.out.println("El área del triángulo es "+((base*altura)/2));
				break;

				case 4:
				System.out.println("Introduce el radio");
				radio = lector.nextDouble();
				resultado = pi*(radio*radio);
				System.out.println("El área del círculo es "+resultado);
				break;

				default:
				System.out.println("La opción no es correcta");







			}


		}

	}
