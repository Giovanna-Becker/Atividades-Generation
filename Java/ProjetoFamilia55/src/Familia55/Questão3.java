package Familia55;

import java.util.Scanner;

public class Questão3 {
	public static void main(String[] args) {
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Você é infantil");
		}else if(idade >= 15 && idade <= 17) {
			System.out.println("Você é juvenil");
		}else if(idade >= 18 && idade <= 25) {
			System.out.println("Você é adulto");
		}else {
			System.out.println("Sua idade não corresponde a idade necessária");
		}
		
	}
}
