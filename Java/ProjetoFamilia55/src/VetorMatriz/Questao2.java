package VetorMatriz;

import java.util.*;

public class Questao2 {

	public static void main(String[] args) {
		int dado[] = new int[10], records = 0, maiorLancamento = 0,  total = 0;
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		for(int x = 0; x < 10; x++) {
			System.out.println("Qual foi o lançamento " + (x+1) + "? ");
			dado[x] = leia.nextInt();
			
			if(dado[x] > 6 || dado[x] < 1) {
				System.out.println("Número inválido.");
				break;
			}else if(dado[x] <= 6 && dado[x] > 0) {
				total += dado[x];
				
				if(dado[x] > maiorLancamento) {
					maiorLancamento = dado[x];
					records++;
				}
				
			}
		}
		
		media = total / 10;
		System.out.println("A média dos lançamentos foi " + media);
		System.out.println("O total de records foi de " + records);

	}

}
