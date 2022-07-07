package Familia55;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		
		Float n1, n2, n3, media; // Float é o real do Portugol
		int op;
		
		Scanner leia = new Scanner(System.in); // Ler uma entrada
		
		//classe.objeto.método
		System.out.println("Entre com a primeira nota: ");
		n1 = leia.nextFloat();
		System.out.println("Entre com a primeira nota: ");
		n2 = leia.nextFloat();
		System.out.println("Entre com a primeira nota: ");
		n3 = leia.nextFloat();
		
		media = (n1 + n2 + n3) / 3;
		System.out.println("\nA média dos números é " + media);
		System.out.printf("\nMédia: %2.2f", media);
		
		if(media >= 7 && media <=10) {
			System.out.println("\nAlune aprovade!");
		}else if(media >= 5 && media <=7) {
			System.out.println("\nAlune em recuperação!");
		}else {
			System.out.println("\nAlune reprovado!");
		}
		
		System.out.println("\n\t\tMenu de Java");
		System.out.println("\n1 - Java seja menos complicado!");
		System.out.println("\n2 - Foi o Java que me deu!");
		System.out.println("\n3 - Java seja menos sentimental!");
		System.out.println("\n4 - Você vai me ajudar muito!");
		System.out.println("\n\nDigite sua opção");
		op = leia.nextInt();

		switch(op) {
		case 1:
			System.out.println("\nJava seja menos complicado!");
		break;
		case 2:
			System.out.println("\nFoi o Java que me deu!");
		break;
		case 3:
			System.out.println("\nJava seja menos sentimental!");
		break;
		case 4:
			System.out.println("\nVocê vai me ajudar muito!");
		break;
		default:
			System.out.println("\nOpção inválida!");
		}
		
		n1 = (float) Math.sqrt(n2); //Raiz quadrada
		n2 = (float) Math.pow(n1, 3); //Potência
		

	}

}
