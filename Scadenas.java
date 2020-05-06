public class Scadenas {
	public static void main(String[] args) {
		
		String alumno1;
		alumno1= "David";

		String alumno2;
		alumno2= "david";

			//Con equalsIgnoreCase, a Java le valen las mayusculas o minusculas
			//con solo equals, si las toma en cuenta :)

			//Aqui da FALSE (diferencia de M y m)
		System.out.println(alumno1.equals(alumno2));

			//Aqui da TRUE (no importa si son M o m)
		System.out.println(alumno1.equalsIgnoreCase(alumno2));
	}
}