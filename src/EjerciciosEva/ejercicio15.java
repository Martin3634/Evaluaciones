package EjerciciosEva;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {

		
		
		Scanner entrada = new Scanner (System.in);
		
		int horario = 1;
		int H, M, S;
		
		switch (horario) {			
		
		case 1:
		
			System.out.println("Ingrese la hora: ");
			H = entrada.nextInt();
			
			if(H >= 1 && H < 24) { 
				System.out.println("Valor válido\n");
			}else {
				System.out.println("Valor incorrecto\n");
				break;
			}
			
			
			
		case 2:
			System.out.println("Ingrese los minutos: ");
			M = entrada.nextInt();
			
			if(M >= 1 && M < 60) { 
				System.out.println("Valor válido\n");
			}else {
				System.out.println("Valor incorrecto\n");
				break;
			}
			
			
			
		case 3:
			System.out.println("Ingrese los segundos: ");
			S = entrada.nextInt();	

			if(S >= 1 && S < 60) { 
				System.out.println("Valor válido\n");
			}else {
				System.out.println("Valor incorrecto\n");
				break;
			}
			
			break;
			
		default:
			System.out.println("ingrese numeros validos");
		
			
			
		}
		
		
	}

}
