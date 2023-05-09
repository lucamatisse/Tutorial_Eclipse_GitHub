package Problema;

import java.util.Scanner;

public class _217LadoCalle2 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int numero = tec.nextInt();
		while (numero != 0) {
			if (numero % 2 == 0) {
//				Pares a la derecha
				System.out.println("DERECHA");
			} else {
//				Impares a la izquierda
				System.out.println("IZQUIERDA");
			}
			numero = tec.nextInt();
		}
	}
}
