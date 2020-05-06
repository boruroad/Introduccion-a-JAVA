import java.util.Scanner;

public class UsoIf{
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int edad;

		System.out.println("Introduce tu edad porfavor");
		edad = lector.nextInt();

		if(edad < 18){
		System.out.println("Eres un adolescente");
		}else{
			if(edad<40){
			System.out.println("Eres joven");
			}else{
				if(edad<65){
					System.out.println("Eres maduro");
				}else{
					System.out.println("Cuidate");
				}
			}
		}
	}
}