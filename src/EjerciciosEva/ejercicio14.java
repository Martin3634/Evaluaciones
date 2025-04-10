package EjerciciosEva;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int n1;
		boolean pagoEntrada = true;
		
		System.out.println("ingrese su edad: ");
		n1 = entrada.nextInt();
		
		if (n1 > 18) {
		
		int R = (int) (Math.random()*100);
		
		if (pagoEntrada == true ){
			
			if ( R >= 50) {
				System.out.println("Puede pasar");
			}
			else {
				System.out.println("no pago la entrada");
			}
			
		}
		
		}
		
		else {
			System.out.println("Usted es menor retirese");
	}

}
}