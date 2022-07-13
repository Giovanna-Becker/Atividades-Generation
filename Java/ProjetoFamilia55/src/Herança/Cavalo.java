package Herança;

public class Cavalo extends Animal{

	private Boolean correr;
	
	public void estadoCavalo() {
		if(this.correr == true) {
			System.out.println(this.nome + " está correndo...");
		}else {
			System.out.println(this.nome + " está parado(a).");
		}
	}
	
	public void correrCavalo() {
		this.correr = true;
	}
	
	public void pararCavalo() {
		this.correr = false;
	}
	
	public Cavalo(String n, String s, int i) {
		this.nome = n;
		this.som = s;
		this.idade = i;
	}
}
