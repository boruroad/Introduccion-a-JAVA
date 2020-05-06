import javax.swing.*;
public class Numeros{
	public static void main(String[] args) {
		String num1= JOptionPane.showInputDialog("Introduce un número");

			double num2= Double.parseDouble(num1);

		System.out.print("La raiz de "+(int)num2+ " es ");
			System.out.printf("%1.2f", Math.sqrt((int)num2));


	}
}