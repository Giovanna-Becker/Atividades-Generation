package VetorMatriz;

import java.util.*;

public class Questao3 {
	public static void main(String[] args) {
		
		int n1[][] = new int[4][6], n2[][] = new int[4][6], m1[][] = new int[4][6], m2[][] = new int[4][6];
		
		Scanner leia = new Scanner(System.in);
		
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				System.out.println("Digite um número para n1: ");
				n1[l][c] = leia.nextInt();
				System.out.println("Digite um número para n2: ");
				n2[l][c] = leia.nextInt();
				
				m1[l][c] = n1[l][c] + n2[l][c];
				m2[l][c] = n1[l][c] - n2[l][c];
			}
		}
		
		System.out.println("A matriz n1:");
			
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				System.out.print(n1[l][c] + "\t");
			}
			System.out.println("");
		}
		
		System.out.println("A matriz n2:");
		
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				System.out.print(n2[l][c] + "\t");
			}
			System.out.println("");
		}
			
		System.out.println("A matriz m1:");
			
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				System.out.print(m1[l][c] + "\t");
			}
			System.out.print("\n");
		}
		
		System.out.println("A matriz m2:");
		
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				System.out.print(m2[l][c] + "\t");
			}
			System.out.print("\n");
		}
	}
}
