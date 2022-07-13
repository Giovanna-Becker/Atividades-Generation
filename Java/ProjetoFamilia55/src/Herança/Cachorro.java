package Herança;

public class Cachorro extends Animal{

	private Boolean correr;
	
	public void estadoCachorro() {
		if(this.correr == true) {
			System.out.println(this.nome + " está correndo...");
		}else if(this.correr == false){
			System.out.println(this.nome + " está parado(a).");
		}
	}
	
	public void correrCachorro() {
		this.correr = true;
	}
	
	public void pararCachorro() {
		this.correr = false;
	}
	
	public Cachorro(String n, String s, int i) {
		this.nome = n;
		this.som = s;
		this.idade = i;
	}
}
