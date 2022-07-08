package LaçoRepeticao;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		
		int num, inseridos = 0, soma = 0, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva um número: ");
		num = leia.nextInt();
		
		do {
			
			if(num % 3 == 0) {
				soma += num;
				inseridos++;
			}
			
			System.out.println("Escreva um número: ");
			num = leia.nextInt();
			
		}while(num != 0);
		
		media = soma / inseridos;
		System.out.println("A média dos múltiplos de 3 é " + media);

	}

}
