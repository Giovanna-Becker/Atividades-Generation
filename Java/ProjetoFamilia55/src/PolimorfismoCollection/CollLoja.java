package PolimorfismoCollection;

import java.util.ArrayList;
import java.util.Scanner;

public class CollLoja {

	public static void main(String[] args) {
		
		ArrayList<String> listaProdutos = new ArrayList<String>();
		
		int op;
		Scanner leia = new Scanner(System.in);
		
		do {
			
				System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
				System.out.println("1 - Ver estoque");
				System.out.println("2 - Adicionar um produto ao estoque");
				System.out.println("3 - Atualizar estoque");
				System.out.println("4 - Remover produto do estoque");
				System.out.println("0 - Encerrar programa");
				System.out.println("\nDigite o número na opção correspondente: ");
				op = leia.nextInt();
				
				switch(op) {
				
				case 1:
					
					if(listaProdutos.isEmpty()) {
						System.out.println("O estoque está vazio");
					} else {
						System.out.println("Estoque: \n");
						for(String lista: listaProdutos) {
							System.out.println(lista);
						}
					}
					
				break;
				case 2:
					
					leia.nextLine();
					System.out.println("Digite o nome do produto: ");
					String nome = leia.nextLine();
					listaProdutos.add(nome);
					
				break;
				case 3:
					
					leia.nextLine();
					System.out.println("Digite o nome do produto que você quer atualizar: ");
					nome = leia.nextLine();
					System.out.println("Digite o nome do novo produto: ");
					String novoNome = leia.nextLine();
					
					if(listaProdutos.contains(nome)) {
						listaProdutos.remove(nome);
						listaProdutos.add(novoNome);
					} else {
						System.out.println("Esse produto não está no estoque. Apenas adicione o produto desejado.");
					}
					
				break;
				case 4:
					
					leia.nextLine();
					System.out.println("Digite o nome do produto que deseja remover: ");
					nome = leia.nextLine();
					
					if(listaProdutos.contains(nome)) {
						listaProdutos.remove(nome);
					} else {
						System.out.println("O produto não consta no estoque");
					}
					
				break;
				case 0:
					System.out.println("Saindo do programa...");
				break;
				default:
					System.out.println("Ocorreu um erro! Por favor tente novamente.");
			}
				
				System.out.println();
			
		}while(op != 0);
		
	}
}
