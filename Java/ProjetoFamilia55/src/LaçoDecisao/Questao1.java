package LaçoDecisao;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		//Float num;
		int cont, maior = 0, num;
		
		Scanner leia = new Scanner(System.in);
		
		for(cont = 0; cont < 3; cont++) {
			System.out.println("Escreva um número: ");
			num = leia.nextInt();
			
			if(num > maior) {
				maior = num;
			}
		}
		
		System.out.printf("O maior número é " + maior);

	}

}
