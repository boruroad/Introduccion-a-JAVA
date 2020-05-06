public class ManipulaCadenas {
	public static void main(String[] args) {
			
		String frase = "Hoy es un gran dia para aprender a programar en Java";

				//Con el Syetem de abajo estamos imrpimiendo cuantas letras tiene la cadena
			//System.out.println("Tu frase tiene "+frase.length()	+ " letras");

				String fraseResumen= frase.substring(0, 24) + "irnos a la playa, olvidarnos de todo y" + 
				frase.substring(23, 52);

						System.out.println(fraseResumen); 
	}
}