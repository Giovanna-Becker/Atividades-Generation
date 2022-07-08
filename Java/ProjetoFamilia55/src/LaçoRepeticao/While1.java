package LaçoRepeticao;

import java.util.Scanner;

public class While1 {
	public static void main(String[] args) {
		
		//Programa termina quando idade = -99
		
		int idade, menor21 = 0, maior50 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		while(idade != -99) {
			
			if(idade < 21) {
				menor21++;
			}else if(idade > 50) {
				maior50++;
			}
			
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
		}
		
		System.out.println("Número inválido!");
		
		System.out.println("Menor que 21: " + menor21);
		System.out.println("Maior que 50: " + maior50);
		
	}
}
