package PolimorfismoCollection;

public class PolCavalo extends PolAnimal {

private boolean correr;
	
	@Override
	public void som() {
		System.out.println("Som: " + nome + " relincha");
	}
	
	void correr() {
		System.out.println(nome + " está correndo...");
		correr = true;
	}
	
	void parar() {
		
		if(correr == true) {
			System.out.println(nome + " parou de correr");
			correr = false;
		} else {
			System.out.println(nome + " está parado");
		}
	}
	
	void mostrar() {
		System.out.println();
		System.out.println("Nome:" + nome);
		System.out.println("Idade:" + idade);
	}
}
