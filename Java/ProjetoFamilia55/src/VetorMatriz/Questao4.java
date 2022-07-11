package VetorMatriz;

import java.util.*;

public class Questao4 {

	public static void main(String[] args) {
		int matriz[][] = new int[3][3], soma = 0, diagonal = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				System.out.println("Escreva um número: ");
				matriz[l][c] = leia.nextInt();
				soma += matriz[l][c];
			}
		}
		
		diagonal = matriz[0][0] + matriz[1][1] + matriz[2][2];
		System.out.println("A soma dos números é " + soma);
		System.out.println("A soma da diagonal principal é " + diagonal);
	}

}
