package PolimorfismoCollection;

import java.util.Scanner;

public abstract class PolAnimal {

	protected String nome;
	protected int idade;
	
	abstract public void som();
	
	Scanner leia = new Scanner(System.in);
	
	void setNome(String animal) {
		System.out.println("Qual o nome do(a) " + animal + "?");
		this.nome = leia.next();
	}
	
	void setIdade() {
		System.out.println("Qual a idade de " + this.nome + "?");
		this.idade = leia.nextInt();
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
	
	
}
