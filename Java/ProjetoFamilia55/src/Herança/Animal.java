package Herança;

public class Animal {

	protected String nome, som;
	protected int idade;
	
	public void pularLinha() {
		System.out.println("");
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public String getSom() {
		return som;
	}
	
	
}
