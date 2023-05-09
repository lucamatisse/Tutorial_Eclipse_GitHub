package Problema;

import java.util.Scanner;

public class _116HolaMundo {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int veces = tec.nextInt();
		
		int contador = 0;
		while (contador < veces) {
			System.out.println("Hola mundo.");
			contador = contador + 1;
		}
	}
}

