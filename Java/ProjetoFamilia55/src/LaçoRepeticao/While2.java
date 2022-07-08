package LaçoRepeticao;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		
		int  idade, x = 1, s = 0, op = 0, resp1, resp2, fNervosa = 0, mAgressivo = 0, calmas = 0, oCalme = 0, maior40 = 0, menor18 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		while(x <= 150) {
			
			System.out.println("\nDigite sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("\n1 - Feminino");
			System.out.println("\n2 - Masculino");
			System.out.println("\n3 - Outros");
			System.out.println("\nQual é o seu sexo?\n");
			resp1 = leia.nextInt();
			
			switch(s) {
			case 1:
				System.out.println("\nFeminino");
			break;
			case 2:
				System.out.println("\nMasculino");
			break;
			case 3:
				System.out.println("\nOutros");
			break;
			}
			
			System.out.println("\n1 - Calma(0)");
			System.out.println("\n2 - Nervosa(0)");
			System.out.println("\n3 - Agressiva(o)");
			System.out.println("\nComo você se indetifica?\n");
			resp2 = leia.nextInt();
			
			switch(op) {
			case 1:
				System.out.println("\nCalma(0)");
			break;
			case 2:
				System.out.println("\nNervosa(0)");
			break;
			case 3:
				System.out.println("\nAgressiva(o)");
			break;
			}
			
			if(resp1 == 3 && resp2 == 1) {
				oCalme++;
				calmas++;
			}else if(resp2 == 1) {
				calmas++;
			}
			
			if(resp2 == 1 && idade < 18) {
				menor18++;
			}
			
			if(resp1 == 1 && resp2 == 2) {
				fNervosa++;
			}
			
			if(resp2 == 2 && idade > 40) {
				maior40++;
			}
			
			if(resp1 == 2 && resp2 == 3) {
				mAgressivo++;
			}
			x++;
		}
		
		System.out.println("\nPessoas calmas: " + calmas);
		System.out.println("\nMulheres nervosas: " + fNervosa);
		System.out.println("\nHomens agressivos: " + mAgressivo);
		System.out.println("\nOutros calmos: " + oCalme);
		System.out.println("\nPessoas nervosas com mais de 40 anos: " + maior40);
		System.out.println("\nPessoas calmas com menos de 18 anos: " + menor18);

	}

}
