package EjerciciosEva;

import java.util.Scanner;

public class ejercicio21 {	
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner entrada = new Scanner(System.in);
		
		int B = 100; // contador al reves
		
		while (B >= 0) {
			Thread.sleep(20);
			System.out.println("El porcentaje de su bateria es del "+B+"%" );
			B--;	
			
		if (B == 20) {
			System.out.println("Batería baja");
			Thread.sleep(1000);
		}
		}
		System.out.println("Batería agotada.");

		
	}

}