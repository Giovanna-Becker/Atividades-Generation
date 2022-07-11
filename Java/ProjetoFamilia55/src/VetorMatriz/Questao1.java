package VetorMatriz;

import java.util.*;

public class Questao1 {

	public static void main(String[] args) {
		
		int notas[] = new int[5], maior = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int x = 0; x < 5; x++) {
			System.out.println("Digite a nota: ");
			notas[x] = leia.nextInt();
			
			if(notas[x] > maior) {
				maior = notas[x];
			}
		}
		
		System.out.println("A maior nota foi " + maior);
		
	}

}
