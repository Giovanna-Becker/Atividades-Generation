package LaçoRepeticao;

import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		
		int soma = 0, num;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Escreva um número ");
			num = leia.nextInt();
			soma += num;
		}while(num != 0);
		
		System.out.println("A soma dos números é " + soma);

	}

}
